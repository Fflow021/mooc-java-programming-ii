
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        if (!(this.shoppingCart.contains(item))) {
            this.shoppingCart.add(new Item(product, 1, price));
            return;
        }

        for (Item itemCart: this.shoppingCart) {
            if (itemCart.equals(item)) {
                itemCart.increaseQuantity();
            }
        }
    }

    public int price() {
        if(this.shoppingCart.isEmpty()){
            return 0;
        }
        
        int totPrice = 0;
        for (Item item : this.shoppingCart) {
            if(item.price() < 0) {
                continue;
            }
            totPrice += item.price();
        }
        return totPrice;
    }

    public void print() {
        for (Item item : this.shoppingCart) {
            System.out.println(item);
        }
    }
}
