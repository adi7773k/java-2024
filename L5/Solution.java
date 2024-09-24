// public class Solution {
//     public void rotate(int[] nums, int k) {
//        k%=nums.length;
//        rotatebyktimes(nums,k);
       
//     }
//     void rotatebyktimes (int [] arr,int k)
// {
    
//     for(int j=1;j<=k;j++)
//     {
//     int num=arr[arr.length-1];
//     for(int i=arr.length-2;i>=0;i--)
//     {
//         arr[i+1]=arr[i];
//    }
//    arr[0] =num;
//    }
   
// }
// } {
    
// }
// M2
public static rotatebyindices(int []arr,int k){
    int[]temp=new int[arr.length];
    int n=arr.length;
    for(int i=0;i<n;i++){
        temp[i+k]=arr[i];
    }
    for(int i=0;i<k;i++){
        temp[i]=arr[n-k+1];
    
    }
    for(int i=0;i<n;i++){
        arr[i]=temp[i];
    }
    
}
