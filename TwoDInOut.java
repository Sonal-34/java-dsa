import java.util.Scanner;
import java.util.Arrays;
public class TwoDInOut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[3][3];
        //Take input from user
        System.out.print("Enter Elements: ");
        for (int row = 0; row < arr.length; row++)
         {
            for(int col=0; col<arr[row].length;col++)
            {
                arr[row][col]=s.nextInt();
            }
        }
        System.out.println("Matrix: ");
        //OUTPUT
        for(int row=0;row<arr.length;row++)
        {
           System.out.println(Arrays.toString(arr[row]));
        }
    }
}
