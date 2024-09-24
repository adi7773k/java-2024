// import java.util.Scanner;

// public class countd {

//     static void count(int number, int digit){
//     int count=0;
//     while (number!=0) {
//         number%=10;
//         if(number==digit)
//         count++;
//     }
//         number/=10;
//     System.out.println(count);
//     }
//     public static void main(String[] args) {
//     int number,value;
// 	 Scanner sc=new Scanner(System.in);
// 	 number=sc.nextInt();
// 	 value=sc.nextInt();
// 	 count(number, value);
//      sc.close();
//     }
// }
import java.util.*;
public class countd {

	static void Count(int number, int digit){
    int count=0;
	int rem;
    while (number!=0) {
        rem=number%10;
        if(rem==digit)
        count++;
    }
        number/=10;
    System.out.println(count);
    }
    public static void main(String args[]) {
     int number,value; 
	 Scanner sc=new Scanner(System.in);
	 number=sc.nextInt();
	 value=sc.nextInt();
	 Count(number, value);
	 sc.close();
    }
}