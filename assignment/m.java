import java.util.*;

public class m {
    static int fib(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0; }
        if (n == 1) {
            return 1; 
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b; 
            a = b;     
            b = c;     
        }
        return b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println(result);
        sc.close(); 
    }
}
