import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println(fact(n));
        s.close();

    }
    static int fact(int n)
    {
        int fact = 1;
        for(int i=n; i>=1; i--)
        {
            fact *= i;
        }
        return fact;

    }
}
