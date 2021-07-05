package HW;

import java.util.Arrays;

public class Task5_1Array {
    public static void main(String[] Args) {
        // Task 1: необходимо вывести сумму всех значений массива.

        //   int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        /*int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
            System.out.println(sum);*/

        // Task 2: необходимо вывести максимальное значение массива

       /* int[] array = {12, 1, 106, 22};
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        System.out.println(result);*/


        // Task 3: необходимо вывести минимальное значение массива
       /* int[] array = {9, -76782, 6, 4, 5, 1, -7, 8, 6};
        int resultMax = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (resultMax > array[i]) {
                resultMax = array[i];
            }
        }
        System.out.println(resultMax);*/

        // необходимо вывести среднее арифметическое всех значений массива.
        /*int[] array = { 10, 7, 1, 2};

        int avgResult1 = 0;
        int avgResult = 1;
        for(int i = 0; i < array.length; i++) {
            avgResult1 += array[i];
            avgResult = avgResult1 / 2;
        }
        System.out.println(avgResult);*/


        // необходимо вывести сумму элементов массива.


        //    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

       /* int[] arr0 = {1, 2, 3, 4, 5};
        int[] arr1 = {6, 7, 8, 9};
        int[] arr2 = {-1, -2, -3, -4};
        int[] arr3 = {-5, -6};

        int[] result = new int [arr0.length + arr1.length + arr2.length + arr3.length];
        int sumArrays = 0;

        for (int i = 0; i < result.length; i++) {
           if (i < arr0.length) {
               result[i] = arr0[i];
           }
        }
        System.out.println(Arrays.toString(result));*/

        //необходимо вывести максимальное значение массива.
        //необходимо вывести количество элементов в массиве.
        //необходимо вывести сумму элементов в массиве.
        int[][] array = {{1, 22, 3, 4, 5}, {6, 7, 8, 1}, {256, -3, -4}, {-5, -6}};

        int sum = 0;
        int minValue = Integer.MIN_VALUE;
        int numberValues = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(minValue < array[i][j]) {
                    numberValues += 1;
                }

                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
                sum += array[i][j];
            }
        //
        }
        System.out.println(numberValues);
    //    System.out.println(sum);
    //    System.out.println(maxValue);
    }


}





