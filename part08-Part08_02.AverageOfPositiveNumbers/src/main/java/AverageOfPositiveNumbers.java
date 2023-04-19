
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cont = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                if (cont == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                break;
            }
            if (input > 0) {
                sum += input;
                cont++;
            }
        }

        System.out.println((1.0 * sum) / cont);
    }
}
