import java.util.Scanner;

public class ArmStrong_No 
{
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.print("Enter a no: ");
         int n = s.nextInt();
         System.out.println(isArmStrong(n));
         if(isArmStrong(n))
         {
            System.out.println(n + " is ArmStrong no");
         }
         else
         {
            System.out.println(n + " is Not an ArmStrong no");
         }
         s.close();

    }
    static boolean isArmStrong(int n)
    {
        int original = n;
        int sum=0;
        while(n > 0)
        {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n/10;
        }
        return sum == original;
     }
 }

