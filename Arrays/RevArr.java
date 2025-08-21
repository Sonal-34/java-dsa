import java.util.Arrays;

public class RevArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println("Original Array is:"+ Arrays.toString(arr));
        findReverse(arr);
        System.out.println("Reversed Array is:"+ Arrays.toString(arr));
    }
    static void findReverse(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start < end)
        {
             swap(arr,start,end);
             start++;
             end--;
        }
    }
    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


}
