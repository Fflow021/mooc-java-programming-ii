
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tacoBox = new TripleTacoBox();
        
        System.out.println("TRIPLE TACO BOX");
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());
        
        System.out.println("CUSTOM TACO BOX");
        
        CustomTacoBox cTacoBox = new CustomTacoBox(5);
        
        System.out.println(cTacoBox.tacosRemaining());
        cTacoBox.eat();
        System.out.println(cTacoBox.tacosRemaining());
        cTacoBox.eat();
        System.out.println(cTacoBox.tacosRemaining());
    }
}
