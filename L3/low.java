import java.util.Arrays;

public class low {
   
    // Print sorted array
    static void display(int[]arr){
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }
    static void display(int arr) 
    {
            System.out.print(arr);
        }
       


    static int lowerbound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                index=mid;
                high=mid-1;
            } 
            else if (arr[mid] < target) {
                low=mid+1;
            } else {
                high = mid - 1; 
            }
        }

        return index;
       
    }

    public static void main(String[] args) {
        int[] nums = {1, 4,4,4, 5, 3, 7, 4};
        int i=4;
         Arrays.sort(nums);
         display(nums);
         int index = lowerbound(nums,i);
         display(index);

       
    }
}