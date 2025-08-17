import java.util.Scanner;

public class Find_Sum 
{
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        int ans  = sum(a,b);
        System.out.println("Sum of two numbers is: " + ans);
        s.close();

    }
    static int sum(int a, int b)
    {
       return a+b;
    }
}
