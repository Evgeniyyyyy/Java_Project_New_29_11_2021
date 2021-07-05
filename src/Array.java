import java.util.Arrays;

public class Array {
    public static void main(String[] Args) {
        //     int [] arr = new int [5];
        int[] arr = {23, 55, -13, 88};


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        /*System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);*/
        //    System.out.println(arr[3]);
        //    System.out.println(sum);
        System.out.println(max);
    }

}
