import java.util.*;
public class q2 {
    // Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String a=sc.nextLine();
     String result =" ";
     for(int i =0;i<a.length();i++){
       if(a.charAt(i)=='e')
       result =result+'i';
       else
       result =result+a.charAt(i);
     }
     System.out.println(result);
     
    }
}
