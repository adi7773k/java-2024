import java.util.Arrays;

public class Arrysort {
    // Print sorted array
    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    static boolean bsearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 3, 7, 4};
        Arrays.sort(nums);
        display(nums);

        System.out.println(bsearch(nums, 7)); // Should output false since 6 is not in the array
    }
}
