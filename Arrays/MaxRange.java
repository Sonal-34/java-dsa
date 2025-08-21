public class MaxRange {
    public static void main(String[] args) 
    {
         int arr[]={2,34,32,23,45,54,67,12};
        findMaxRange(arr,1,4);

        System.out.println("Largest element form the range is " + findMaxRange(arr,1,4));
    }
     static int findMaxRange(int[] arr, int start, int end)
      {
     int max = arr[start];
        for (int i = start; i <= end; i++) 
        {
            if(arr[i] > max)
                max = arr[i];

        }
        return max;
    }
}
