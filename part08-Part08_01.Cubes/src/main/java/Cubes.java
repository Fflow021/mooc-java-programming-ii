
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            } else {
                int stringToInt=  Integer.valueOf(input);
                int cube = stringToInt*stringToInt*stringToInt;
                System.out.println(cube);
            }     
        }
    }
}
