public class array2 {
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        // 1. Create a table for n.
         int n=5;
         int[] table= new int[10];
        for(int i=0; i<table.length;i++){
            table[i]= n*(i+1);  
        }
        display(table);
        //2. Search m in this table.
        int m= 40;
        for(int i=0;i<table.length;i++){
            if(table[i]==m)
            System.out.println(i);
         }
        //3. if found print it's index.

       
    }
}
