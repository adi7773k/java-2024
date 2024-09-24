import java.util.*;
public class Main {
   static int reverse(int num)
   {
	   int rev=0;
	   while(num!=0)
	   {
		   int rem=0;
		   rem=num%10;
		   rev=(rev*10)+rem;
		   num/=10;
	   }
	   return rev;
   }


    public static void main(String args[]) {
     int number;
	 Scanner sc=new Scanner(System.in);
	 number=sc.nextInt();
	 int reversednum=reverse(number);
	 System.out.print(reversednum);
    }
}

