
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here

        //check contains
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));

        System.out.println("");

        System.out.println("=========//========");

        //check indexOfValue
        List<String> myList3 = new List<>();
        System.out.println(myList3.contains("hello"));
        myList3.add("hello");
        System.out.println(myList3.contains("hello"));
        int index = myList3.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList3.value(index));
        myList3.remove("hello");
        System.out.println(myList3.contains("hello"));

        System.out.println("");

        System.out.println("=======//==========");

        //check size and grow
        List<Integer> myList4 = new List<>();

        for (int i = 0; i < 20; i++) {
            myList4.add(i);
        }

        System.out.println(myList4.size());

        System.out.println("");

    }

}
