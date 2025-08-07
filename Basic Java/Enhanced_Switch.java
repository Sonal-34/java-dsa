import java.util.Scanner;

public class Enhanced_Switch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Fruit: ");
        String fruit=s.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits..");
            case "Apple" -> System.out.println("Sweet Red Apples..");
            case "Orange" -> System.out.println("Orange Fruit..");
            case "Grapes" -> System.out.println("Small Fruit..");
            default -> System.out.println("Please enter a valid fruit..");
        }
    }
}
