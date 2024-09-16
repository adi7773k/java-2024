public class KadaneMethod {
    // 1. Brute Force: Generate All subarrays
    // static int findMaxSum(int[] arr) {
    //     // int maxSum = 0;
    //     int maxSum = Integer.MIN_VALUE; // Initialize to the smallest integer value
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             int tempSum = 0;
    //             for (int k = i; k <= j; k++) {
    //                 tempSum += arr[k];
    //             }
    //             maxSum = Math.max(maxSum, tempSum);
    //         }
    //     }

    //     return maxSum;
    // }

    // //2. brut force using 2 loops
    // static int findMaxSum2(int[]arr){
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i =0;i<arr.length;i++){
    //         int tempSum=0;
    //         for(int j=i;j<arr.length;j++)
    //         tempSum+=arr[j];
    //         maxSum=Math.max(maxSum,tempSum);
    //     }
    //     return maxSum;
    // }

    //3. kadnes also

    static int findMaxSum3(int[]arr){
        int maxSum=Integer.MIN_VALUE;
        int tempSum=0;
        for(int i=0;i<arr.length;i++){
        tempSum+=arr[i];
        if(tempSum==0){
        tempSum=0;}
        maxSum=Math.max(maxSum, tempSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, 3, 4};
        System.out.println(findMaxSum3(arr)); // Output should be 9, which is the sum of the subarray [4, -2, 3, 4]
    }
}
