public class NSE {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }
    
    // static int[] createNSER(int[] arr){
    //     int[] NSER= new int[arr.length];
    //     int maxElement= Integer.MAX_VALUE;
    //     for(int i=arr.length-1; i>=0;i--){
    //         NSER[i]= maxElement;
    //         if(arr[i]<maxElement)
    //             maxElement=arr[i];
    //     }
    //     return NSER;
    // }
    static int[] createNSEL(int[] arr){
        int[] NSEL= new int[arr.length];
        int maxElement=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            NSEL[i]= maxElement;
            if(arr[i]<maxElement)
                maxElement=arr[i];
        }
        return NSEL;
    }
    public static void main(String[] args) {
        int[] arr= {1,5,7,5,8,4,6};
        // int[] NSER= createNSER(arr);
        int[] NSEL= createNSEL(arr);
        // display(NSER);
        display(NSEL);
    }
}