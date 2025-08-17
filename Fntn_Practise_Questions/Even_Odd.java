import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        checkEO(n);
        s.close();

    }
    static void checkEO(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println(n + " is Even");
        }
        else
        {
             System.out.println(n + " is Odd");
        }
    }
}

