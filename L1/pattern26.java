public class pattern26 {
    public static void main(String[] args) {
        int rows = 5; 
        int q=1;

        for (int i = 1; i <= rows; i++) 
        {
            
            for (int j = 1; j <= rows - i; j++)
           {
                System.out.print("  ");
            }

 
            for (int j = 1; j <= 2 * i - 1; j++) {
                  
                    System.out.print(q+" " );
                    q++;
                }
                System.out.println();
        }
    }
}
