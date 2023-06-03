
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String row = scanner.nextLine();
            if(row.equals("end")){
                break;
            }
            
            inputs.add(row);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if(input.equals("p")) {
            double avg = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + avg);
        } else {
            double avg = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()  
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + avg);
        }
    }
}
