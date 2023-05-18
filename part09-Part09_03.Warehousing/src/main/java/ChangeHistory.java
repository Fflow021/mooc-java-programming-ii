
import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history; 
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if(history.isEmpty()) {
            return 0;
        }
        
        double max = this.history.get(0);
        
        for(double value: this.history) {
            if (value > max) {
                max = value;
            }
        }
        
        return max;
    }
    
    public double minValue() {
        if(history.isEmpty()) {
            return 0;
        }
        
        double min = this.history.get(0);
        
        for(double value: this.history) {
            if(value < min) {
                min = value;
            }
        }
        
        return min;
    }
    
    public double average() {
        if(history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        int cont = 0;
        for(double value: this.history) {
            sum += value;
            cont++;
        }
        
        return sum/(cont*1.0);
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
    
}
