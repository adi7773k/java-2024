// could not solve

public class revusingtemp {

    static void display(int[] arr){
        for( int i: arr)                                                    // for each loop
        System.out.print(i + " ");
        System.out.println();
    }

    // Reverse using temp array
    static void reverseArray(int[] arr,int x, int y)
    {
        int[] temp= new int[y-x+1];
        for(int i=x; i<=y; i++)
        {
            temp[y-i]= arr[i];
        }
        display(temp);
        // for(int i=x;i<y;i++)
        // {
        //   arr[i]=temp[i];                                //deep copy
        // }
        
        // display(arr);
    }

        public static void main(String[] args) {
            int[] nums= {8,2,1,3,4,5};
           
            int i=2;
            int j=4;
            reverseArray(nums,i,j);
          
    }
}
