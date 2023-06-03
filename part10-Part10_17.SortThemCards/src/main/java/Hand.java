
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream()
                .forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int value() {
        return hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (value, sum) -> value + sum);
    }
    
    public int compareTo(Hand comparedHand) {
        return this.value() - comparedHand.value();
    }
    
    public void sortBySuit() {
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Collections.sort(hand, comparator);
    }
}
