
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(input, age));
        }
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getName);
        
        Collections.sort(bookList, comparator);
        
        System.out.println(bookList.size() + " books in total.\n");
        
        for(Book book: bookList) {
            System.out.println(book);
        }
    }
}
