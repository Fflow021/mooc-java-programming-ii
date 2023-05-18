/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory cHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.cHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.cHistory.add(initialBalance);
    }
    
    public String history() {
        return this.cHistory.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.cHistory.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        this.cHistory.add(super.getBalance());
        return taken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.cHistory);
        System.out.println("Largest amount of product: " + this.cHistory.maxValue() );
        System.out.println("Smallest amount of product: " + this.cHistory.minValue());
        System.out.println("Average: " + this.cHistory.average());
    }
}
