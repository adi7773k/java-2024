public class function6 {
    
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int i=2;
        int j=4;
        reversearray(nums);
         
        // swapElement(nums,i,j);
        // reverseUsingSwap(nums);
        display(nums,2,4)
    }

    static void reversearray(int[] arr) {
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
        temp[arr.length-1-i]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        arr[i]=temp[i];   //deep copy
        // arr=temp;    shallow copy
    }
        static void display(int[]arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // static void reverseUsingSwap(int[] arr){
        //     int i=0, j=arr.length-1;
        //     while(i<j)
        //         swapElements(arr, i++, j--);
        // }
      
        }

    }
     
    


