public class check 
{
   static boolean check2(String a){
    String rev =new string((a).reverse().toString())
   } 


    static boolean check1(String a){
    
        
        int left = 0;
        int right = a.length() - 1; 
    
    
            while (left < right) {
                if (a.charAt(left)!=a.charAt(right))
                return false;
                left++;
                right--;
                }
                return true; 
            }
    
        public static void main(String[] args) {
        String s1 =new String("bob");
        boolean result1=check1(s1);         //using 2 ppointer
        boolean result2=check2(s1);         //new string comparision
        System.out.println(result1);
        System.out.println(result2);
            }
}
