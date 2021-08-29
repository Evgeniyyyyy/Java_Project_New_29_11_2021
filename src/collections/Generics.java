package collections;

public class Generics {

        public static <T> void printArray( T [] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
        }

        public static void main(String[] args) {


            Integer[] arrayInt = new Integer[]{1, 2, 3, 4, 5};
            String[] arrayStr = new String[]{"one", "two", "three", "for", "five"};
            Double[] arrayDouble = new Double[]{1.1, 1.2, 1.3, 1.4, 1.5};
            Integer[] arrayInt1 = new Integer[]{6, 7, 8, 9, 10};

            printArray(arrayInt);
            printArray(arrayStr);
            printArray(arrayDouble);
            printArray(arrayInt1);

        }
    }

