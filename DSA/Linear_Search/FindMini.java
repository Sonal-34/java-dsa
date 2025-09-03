public class FindMini {
   public static void main(String[] args) {
    int arr[] = {18, 12, -7, 3, 14, 28};
    System.out.print("Minimum Element is: ");
        System.out.println(miniMum(arr));
    }


    //assume an empty arraay
    static int miniMum(int arr[]) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
   } 

