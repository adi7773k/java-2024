import java.util.Arrays;
public class low {
   
    // Print sorted array
    static void display(int arr) 
    {
            System.out.print(arr);
        }
       


    static int lowerbound(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == num) {
                ans=mid;
                high=mid-1;
            } 
            else if (arr[mid] > mums) {
                high = mid - 1; 
            } else {
                low=mid+1;
            }
        }

        return ans;
       
    }

    public static void main(String[] args) {
        int[] nums = {1, 4,4,4, 5, 3, 7, 4};
        int i=4;
        lowerbound(nums, i);
        int ans;
        display(ans);

       
    }
}


