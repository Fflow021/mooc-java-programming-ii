import java.util.ArrayList;

public class Box implements Packable {

    private double boxSize;
    private ArrayList<Packable> items;

    public Box(double boxSize) {
        this.boxSize = boxSize;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double totalWeight = 0;
        for (Packable packable : items) {
            totalWeight += packable.weight();
        }
        return totalWeight;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= boxSize) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
