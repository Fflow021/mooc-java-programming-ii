/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */
public class Container {
    private int container;
    
    public Container() {
        this.container = 0;
    }
    
    public void add(int amount) {
       if (container + amount <= 100 && amount > 0) {
           container += amount;
       } else if (container + amount >= 100) {
           container = 100;
       } 
    }
    
    public void remove(int amount) {
        if (amount > container) {
            container = 0;
        } else {
            container -= amount;
        }
    }

    public int contains() {
        return container;
    }

    @Override
    public String toString() {
        return container + "/100";
    }
    
    
}
