public class up 
{
    
    static int upperbound(int[] arr, int num) {
        int ans;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == num) {
                ans=mid+1;
                low=mid-1;
            } 
            else if (arr[mid] < mums) {
                low = mid + 1; 
            } else {
               high=mid-1;
            }
        }

        return ans;
       
    }
  
    public static void main(String[] args) {
        int[] nums = {1, 4,4,4, 5, 3, 7, 4};
        upperbound(nums, 4);
      
    
}
}