import java.util.Arrays;

public class MyArrayWorkKlass {
    public static void main(String[] Args) {
        int[] a = {10, 20, 30};
        int[] b = {7, 8, 9};
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];

            }
            else {
                result[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
