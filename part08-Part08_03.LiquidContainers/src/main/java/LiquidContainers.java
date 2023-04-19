
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount >= 0 && amount <= 100) {
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }
                }

                if (amount > 100) {
                    first = 100;
                }
            }

            if (command.equals("move")) {
                if (first > 0) {
                    if (amount > first) {
                        second = first;
                        first = 0;
                    }
                    
                    else if (second + amount > 100) {
                        second = 100;
                        first -= amount;
                    }

                    else if (amount >= 100) {
                        first = 0;
                        second = 100;
                    }
                    
                    else if (amount >= 0 && amount <= 100) {
                        second = amount;
                        first -= amount;
                    }
                }
            }
            
            if (command.equals("remove")) {
                if(second > 0) {
                    if (amount >= second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }     
                }
            }
        }
    }

}
