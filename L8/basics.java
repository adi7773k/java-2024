import java.util.*;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
    int [][] num=new int[row][col];
    for(int i =0;i<row;i++){
     for(int j =0;j<col;j++){
       num[i][j]=sc.nextInt();
     }
    }
    display(num);
    sortComplete(num);
}
        static void display(int[][] nums){
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[0].length;j++){
                    System.out.print(nums[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }

//search a number and prtint indices
// for(int i =0;i<row;i++){
//     for(int j =0;j<col;j++){
//         if(num[i][j]==2)
//        System.out.print(i + ","+ j );
//     }
  
// }
//Sum
    //Sort 2D Array: By Rows, By Cols, Whole 2D Array
    //Rows
    static void sortByRows(int[][] nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
        display(nums);   
    }
    //cols
    static void sortByCols(int[][] nums){
        Arrays.sort(nums,(a,b)->Integer.compare(a[0], b[0]));  
    }
    //Whole Matrix
    // static void sortComplete(int[][] nums){
    //     int[] arr= flaten(nums);
    //     Arrays.sort(arr);
    //     fillArray(nums, arr);
    }

