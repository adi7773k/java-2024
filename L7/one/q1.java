import java.util.*;
public class q1 {
    public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // String a =sc.next();
    // System.out.println(a);
    // String b =sc.next();
    // System.out.println(b);
    // String c=a+b;
    // System.out.println(c.length());
    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    String array[]= new String[size];
    int ttll=0;
    for(int i=0;i<size;i++){
        array[i]=sc.next();
        ttll+=array[i].length();
    }
    System.out.println(ttll);
    

    }
}
