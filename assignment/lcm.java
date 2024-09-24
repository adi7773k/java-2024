import java.util.*;
public class lcm {
    public static void main(String[] args) {
        int num1,num2;
         Scanner s = new Scanner(System.in);
         num1 = s.nextInt();
         num2 = s.nextInt();
		 s.close();
        int lcm=Math.max(num1, num2);
        while (true) {
            if(lcm%num1==0 && lcm%num2==0){
                System.out.println(lcm);
                break;
            }
            lcm++;

        }

    }
}
