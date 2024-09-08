public class function5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        revarr(arr);

    }

    static void revarr(int[] arr) {
        for (int i=arr.length-1;i>0;i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
