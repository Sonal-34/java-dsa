import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
         int arr[]={3,5,9,74,2};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
