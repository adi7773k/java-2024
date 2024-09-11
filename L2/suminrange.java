public class suminrange {
    static void display(int x) {
        System.out.println(x);
    }

    static int findSum(int[] arr, int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 1, 3, 4, 5};
        
        int i = 2;
        int j = 4;

        int sum = findSum(nums, i, j);
        display(sum);
    }
}
