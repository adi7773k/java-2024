public class function4 {
 
    
    static int findSum(int[] arr) {
        int sum = 0; 
        for (int i : arr) { 
            sum += i; 
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        int sum = findSum(arr); 
        System.out.println(sum); 
        
    }
}

