public class rotate {
 
    static void display(int[] arr){
        for( int i: arr)                                                    // for each loop
        System.out.print(i + " ");
        System.err.println();
    }
       
    
    static void reverseUsingSwap(int[] arr,int i, int j ) 
    {
        while (i < j) 
        {
            int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;        
    }
    display (arr) ;
    rotateby1(arr);
}
//rotate 1 piece of the arry 
// static void rotateby1 (int [] arr){
//     int num=arr[arr.length-1];
//     for(int i=arr.length-2;i>=0;i--){
//         arr[i+1]=arr[i];
// }
// arr[0] =num;
// display(arr);
// }
static void rotatebyktimes (int [] arr)
{
    int k=3;
    for(int j=1;j<=k;j++)
    {
    int num=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--)
    {
        arr[i+1]=arr[i];
   }
   arr[0] =num;
   }
   display(arr);
}
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        // reverseUsingSwap(arr, 2, 3);
        rotatebyktimes(arr);
    }
}
