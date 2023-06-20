
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random randomizer = new Random();

        for (int i = 0; i < 7; i++) {
            while (true) {
                int randomNumber = randomizer.nextInt(40) + 1;
                
                if (!containsNumber(randomNumber)) {
                    this.numbers.add(randomNumber);
                    break;
                }
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int lotteryNumber : numbers) {
            if (lotteryNumber == number) {
                return true;
            }
        }
        return false;
    }
}
