import java.util.*; 
public class string {
    public static void main(String[] args) {
        // declare
        String s=" my naem is tony";
        // input
        // Scanner sc= new Scanner(System.in);
        // String name =sc.nextLine();
        // System.out.println(name);
        // functions
        // 1.concatination
        // String a="tiny";
        // String b="strk";
        // String c= a+b;
        // System.out.println(c.length());

        // 2.charAt

        // for(int i=0;i<c.length();i++)
        //     System.out.println(c.charAt(i));
        
    //    3compare
    // String a="tiny";
    // String b="strk";
    // s1>s2 +ve
    // s1==s2 0
    // s1<s2 _ve
    // if(a.compareTo(b)==0)
    //     System.out.println("equal strings");
    //     else{
    //         System.out.println("not equal");
        // }


        // substring
        String a="tiny";
        String b=a.substring(0, a.length());   //end is excluded
        System.out.println(b);                              //if last index not passed do ending index is considered as last


        // strings are immutable once string created then can't be changed only changed when creaded new strings 

    }
}
