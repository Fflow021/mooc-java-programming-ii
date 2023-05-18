public class ProductWarehouse extends Warehouse {
    private String productName;
    
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }
    
    public String getName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
    
    
}
