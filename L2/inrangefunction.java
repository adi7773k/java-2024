public class inrangefunction
{

    //Function to display Array
    static void display(int[] arr){
        // for(int i=0;i<arr.length;i++){                                  //for loop
        //     System.out.print(arr[i] + " ");
        // }
        for( int i: arr)                                                    // for each loop
        System.out.print(i + " ");
        System.err.println();
    }

    //function to print in range 
    static int display(int[] arr, int x, int y) 
    {
        for (int i = x; i <= y;i++ ) {
            System.out.print(arr[i] + " ");
            
        }
    
    }    

     

    Function to sum of Array
    static int findSum(int[] arr)
    {
        int sum=0;
        for(int i:arr){
        // sum+=i;
        sum=sum+i;}
        return sum;
    } 

    // Function to print reverse of array
    // static void printrev(int[] arr)
    // {
    //     for(int i=arr.length-1;i>=0;i--)
    //     {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    
    // Reverse using temp array
    // static void reverseArray(int[] arr)
    // {
    //     int[] temp= new int[arr.length];
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         temp[arr.length-1-i]= arr[i];
    //     }
    //     // display(temp);                              // we stored reverse of array in temp sucessfully
    //     //arr=temp;                                     // shallow copy
    //     for(int i=0;i<arr.length;i++)
    //     {
    //       arr[i]=temp[i];                                //deep copy
    //     }
    //     display(arr);
    // }

    // function to swap elements
    // static void swapElements(int []arr, int i, int j)
    // {
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    //     display(arr);
    // }

    // static void reverseUsingSwap(int[] arr) 
    // {
    //     int i = 0;
    //     int j = arr.length - 1;
    //     while (i < j) 
    //     {
    //         swapElements(arr, i++, j--);  // Swap elements at indices i and j
          
    //     }
       
    // }

   

    public static void main(String[] args) {
        int[] nums= {8,2,1,3,4,5};
        // display(nums);
        // int sum= findSum(nums);
        // System.out.println(sum);
        // printrev(nums);
        // reverseArray(nums);
        int i=2;
        int j=4;
        // swapElements(nums,i,j);
        // reverseUsingSwap(nums);
        display(nums, i, j);
    }
}

