import java.util.Scanner;
public class Max_Min {
     public static void main(String[] args) 
     {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        System.out.print("Enter c: ");
        int c = s.nextInt();
        System.out.println(" Maximum no is: "  + max(a,b,c));
        System.out.println(" Minimum no is: "  + min(a,b,c));
        s.close();
    }
    static int max(int a, int b, int c) {
        int max = a; //assuming a is max here
        if(b > max) max =b;
        if(c > max) max = c;
        return max;

    }
    static int min(int a, int b, int c) {
        int min = a; //assuming a is min here
        if(b < min) min = b;
        if(c < min) min = c;
        return min;

    }

}
