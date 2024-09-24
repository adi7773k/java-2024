import java.util.*;
public class btod {

   static int binaryToDecimal(int num)
   {
       int lastdigit =0;
	   int i=0;
       int d=0;
	   while(num!=0)
	   {
		   lastdigit=num%10;
		   num/=10;
            d=d+lastdigit*(int)Math.pow(2, i++);
	   }
       return d;
	   
   }


    public static void main(String args[]) {
     int number;
	 Scanner sc=new Scanner(System.in);
	 number=sc.nextInt();
	 int decimalValue = binaryToDecimal(number);
        System.out.print(decimalValue);
     sc.close();
    }
}



