public class MaxElement {
  public static void main(String[] args) {
    int arr[]={3,4,45,6,89,10};
       max(arr);
        System.out.print("Largest element is " + max(arr));

  }  
  static int max(int arr[])
    {
        int max_val = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max_val)
            {
                max_val = arr[i];
            }

        }
        return max_val;

    }
}
