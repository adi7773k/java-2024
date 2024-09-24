public class NGE {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }
    
    static int[] createNGER(int[] arr){
        int[] NGER= new int[arr.length];
        int maxElement= -1;
        for(int i=arr.length-1; i>=0;i--){
            NGER[i]= maxElement;
            if(arr[i]>maxElement)
                maxElement=arr[i];
        }
        return NGER;
    }
    static int[] createNGER(int[] arr){
        int[] NGEL= new int[arr.length];
        int maxElement= -1;
        for(int i=0; i<arr.length;i++){
            NGEL[i]= maxElement;
            if(arr[i]>maxElement)
                maxElement=arr[i];
        }
        return NGEL;
    }
    public static void main(String[] args) {
        int[] arr= {1,5,7,5,8,4,6,2};
        // int[] NGER= createNGER(arr);
        int[] NGEL= createNGER(arr);
        display(NGEL);
    }
}