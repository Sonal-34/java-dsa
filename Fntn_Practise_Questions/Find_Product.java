import java.util.Scanner;

public class Find_Product {
      public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        int ans = product(a,b);
        System.out.println("Product of two numbers is: "+ans);
        s.close();

    }
    static int product(int a, int b) {
        return a * b;
    }
}
