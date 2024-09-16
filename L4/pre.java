public class pre {

    static void disply(int []arr){
        int[] preSum= new int[arr.length];
        preSum[0]=arr[0];
        System.out.println(preSum[0]);
        for(int i=1;i<arr.length;i++){
            preSum[i]=preSum[i-1]+arr[i];
            System.out.print(preSum[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,1,2,1,2};
        disply(arr);
        
    }
}