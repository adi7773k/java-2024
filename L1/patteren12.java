public class patteren12 {
    public static void main(String[] args) {
        // int n = 5; // Number of rows
        
        // for (int i = 1; i <= n; i++) {
        //     // Print leading spaces for alignment
        //     for (int k = 1; k <= (n - i); k++) {
        //         System.out.print("  "); // Two spaces for alignment
        //     }

        //     // Print the pattern
        //     for (int j = 1; j <= i; j++) {
        //         if (j % 2 == 0) { // Even index in the current row
        //             System.out.print("! ");
        //         } else { // Odd index in the current row
        //             System.out.print("* ");
        //         }
        //     }
        //         for (int a = 2; a <= i; a++) {
        //             if (a % 2 == 0) { // Odd index in the current row
        //                 System.out.print("! ");
        //             } else { // Even index in the current row
        //                 System.out.print("* ");
        //             }
        //         }

        //     // Move to the next line
        //     System.out.println();
        // }
        int rows = 5; // Adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

 
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}
    
    

