
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herd;
    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        String willReturn = "";
        for(Movable movable: this.herd) {
            willReturn += movable.toString() + "\n";
        }
        return willReturn;
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for(Movable movable: this.herd) {
            movable.move(dx, dy);
        }
    }
}
