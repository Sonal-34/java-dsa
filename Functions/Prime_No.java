import java.util.Scanner;
public class Prime_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=s.nextInt();
        boolean ans = isPrime(n);
        System.out.println(isPrime(n));

        if(ans)
        {
            System.out.println(n + " is a Prime Number");
        }
        else
        {
            System.out.println(n + " is Not a Prime Number");
        }
        s.close();
    }
    static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        int i=2;
        while(i * i <= n)
        {
            if(n % i == 0)
               {
                return false;
               }
               i++;
        }
        return i*i >n;
        
    }
}
