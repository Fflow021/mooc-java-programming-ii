import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> warehouse;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        if(!(this.warehouse.containsKey(product))){
            return -99;
        }
        
        return this.warehouse.get(product);
    }
    
    public int stock(String product) {
        if(!(this.warehouse.containsKey(product))) {
            return 0;
        }
        
        return this.stockMap.get(product);
    }
    
    public boolean take(String product) {
       if(this.stockMap.containsKey(product) && this.stockMap.get(product) > 0) {
           this.stockMap.replace(product, this.stockMap.get(product)-1);
           return true;
       } 
       
       return false;
    }
    
    public Set<String> products() {
        Set<String> set = this.stockMap.keySet();
        return set;
    }
}
