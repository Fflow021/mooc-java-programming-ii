
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> box;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int totWeight() {
        int total = 0;
        for (Item item: box) {
            total += item.getWeight();
        }
        
        return total;
    }
    
    @Override
    public void add(Item item) {
        if (item.getWeight() + totWeight() <= this.capacity) {
            this.box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.box.contains(item);
    }
}
