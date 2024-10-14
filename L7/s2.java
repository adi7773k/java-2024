public class s2 {
    /*
    //Q1. Function To reverse a string
        Eg: potato => otatop
    //q2. Function to Check if a string is Pallindrome or Not
        Eg: detartrated=> True 
    //q3. find the Maximum Occuring element in a Sorted String
        Eg: aaabbbbcdd => b
    //q4. find the Maximum Occuring Element in a String
        Eg: aababcdabca =>a
    //q5. Function to reverse the words of a string.
        Eg: the bird is flying => flying is bird the
    //Homework Ques. 424 on Leetcode
    */  
    static String reverse(String s1){
        String s2=" ";
        for (int i=s1.length()-1;i>=0;i--){
        s2= s2+s1.charAt(i);   
    }   
    return s2;
    }


//      or
// static boolean Pallindrome(String s){
//     int i=0, j= s.length()-1;
//     while(i<=j){
//         if(s.charAt(i)!=s.charAt(j))
//             return false;
//         i++;j--;
//     }
//     return true;
// }
static char maxoccuring(String s1){
    int[] arr= new int [256];
    for (int i=0;i<s1.length();i++){
       arr[s1.charAt(i)]+=1;

    }
    int max= -1;
    char c=' ';
    for (int i=0;i<s1.length();i++){
        if (max<arr[s1.charAt(i)]){
            max=arr[s1.charAt(i)];
            c=s1.charAt(i);
        }
    }
    return c;
}
static void reverseWords(String s){
    String[] arr= s.split(" ");  //split by space
    System.out.print("!");
    String temp="";
    for(int i=arr.length-1;i>=0;i--){
        temp+=arr[i]+" ";
    }
    temp=temp.trim();
    System.out.print(temp);
    System.out.print("!");
}

    public static void main(String[] args) {
        String original= "she is good";
        // String rev= reverse(original);
        // System.out.println(rev);
        // boolean result = Pallindrome(original);
        // System.out.println(result);
        // reverseWords(original);
        char maxoc=maxoccuring(original);
        System.out.println(maxoc);
        reverseWords(original);
    }
}

