
import java.util.Objects;


public class Item {
    private String product;
    private int quantity, unitPrice;

    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.quantity * this.unitPrice;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
}
