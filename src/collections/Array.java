package collections;

public class Array {
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
    public static void main(String[] args) {


        int[] arrayInt = new int[]{1, 2, 3, 4, 5};
        String[] arrayStr = new String[]{"one", "two", "three", "for", "five"};
        double[] arrayDouble = new double[]{1.1, 1.2, 1.3, 1.4, 1.5};

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayDouble[i]);
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayStr[i]);
        }
        printArray(arrayInt);
        printArray(arrayStr);
        printArray(arrayDouble);

    }
}
