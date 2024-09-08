public class function10 {

    static void display(int[] arr, int x, int y) {
        for (int i = x; i <= y;i++ ) {
            System.out.print(arr[i] + " ");
            
        }
    }
    static int findSum(int[] arr) {
        int sum = 0; 
        for (int i : arr) { 
            sum += i; 
        }
        return sum;
    

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6,7,8};
        int i = 2;
        int j = 7;
        display(nums, i, j);
        int sum = findSum(arr); 
        System.out.println(sum);  
    }
    
}

