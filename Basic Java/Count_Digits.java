import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=s.nextInt();
        int count=0;

        while(n>0)
        {
             int rem = n % 10;
             if(rem == 3)
             {
                count++;
             }
                n = n/10;
        }
        System.out.println(count);
        s.close();
    }
}
