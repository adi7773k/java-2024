public class patteren10 {
    public static void main(String[] args) {
    //     int n = 5; 
    //         for(int i=n;i>=1;i--){

    //             for(int k=1;k<=n-i;k++){
    //             System.out.print(" ");}
    //             for(int j=1;j<=2*i-1;j++)
    //             System.out.print("*");
    //             System.out.println();
    //         }
    int n=5;
    for (int i=n;i>=1;i--){
        for(int k=1;k<=(n-i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int a=2;a<=i;a++){
            System.out.print("*");
        }
        System.out.println();
    }



    }
}
