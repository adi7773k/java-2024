public class patteren11 {
    public static void main(String[] args)
    {

    // int n=5;
    // for (int i=1;i<=n;i++){
    // for(int k=1;k<=(n-i);k++){
    // System.out.print("  ");
    // }
    // for(int j=1;j<=i;j++){
    // System.out.print("* ");
    // }
    // for(int a=1;a<i;a++){
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    int rows = 5; 

        for (int i = 1; i <= rows; i++) 
        {
            
            for (int j = 1; j <= rows - i; j++)
           {
                System.out.print("  ");
            }

 
            for (int j = 1; j <= 2 * i - 1; j++) {
              
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}