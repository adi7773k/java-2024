public class strings {

//    static void compute(int i ,int j){
//     if(i==j)
//     System.out.println("0");
//     else if(i<j)
//     System.out.println("-1");
//     else
//     System.out.println("1");
//    }

static boolean check(String a){
    
        
    int left = 0;
    int right = a.length() - 1; 


        while (left < right) {
            if (a.charAt(left)!=a.charAt(right))
            return false;
            }
            left++;
            right--;
            return true; 
        }


    public static void main(String[] args) {
        String s1 =new String("radar");
    //     // System.out.println(s1);
        // String s2= "keshu";
    //    int i=s1.length(); 
    //    int j=s2.length(); 
    //    compute(i,j);
    // System.out.println(s1.compareTo(s2));
    boolean result=check(s1);
    System.out.println(result);
    }
}
