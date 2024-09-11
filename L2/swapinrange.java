public class swapinrange 
{
     // Function to print reverse of array
    static void printrev(int[] arr, int x,int y)
    {
        for(int i=y;i>=x;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
public static void main(String[] args) {
    int[] nums= {8,2,1,3,4,5};
    int i=2;
    int j=4;
    printrev(nums,i,j);
   
}
}
