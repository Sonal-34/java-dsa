public class Linear_S {
    public static void main(String[] args) {
        int nums[] ={2,3,14,31,5,78,9,10,16,13};
        int target = 16;
        int ans = linearSearch(nums,target);
        System.out.println("Index of targeted value is " + ans);

    }
    static int linearSearch(int arr[], int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for(int i=0 ; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;//here we will return the index no
            }
        }
        return -1;
    }
}
