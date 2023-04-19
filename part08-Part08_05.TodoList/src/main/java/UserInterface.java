
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list,Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
        
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("To add:");
                String addInput = scanner.nextLine();
                this.list.add(addInput);
            }
            
            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int removeInput = Integer.valueOf(scanner.nextLine());
                this.list.remove(removeInput);
            }
            
            if (input.equals("list")) {
                list.print();
            }
        }
    }
}
