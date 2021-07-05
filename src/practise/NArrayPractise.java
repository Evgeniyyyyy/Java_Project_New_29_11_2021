package practise;

import java.util.Arrays;

public class NArrayPractise {
    public static void main(String[] Args) {

    /*    // Declaration
        // Primitive

        int [] array1;
        double [] array2;
        boolean [] array3;
        char [] array4;

        // Objects
        // Reference

        String [] array5;
        Integer [] array6;
        Teacher_HW [] array7;
        Cats [] array8;

       // 2. Memory Allocation
      array1 = new int[5];
      array2 = new double[3];
      array3 = new boolean[4];
      array4 = new char[4];
      array5 = new String[5];

      // 3. Array initialization

        array1 [0] = 10;
        array1 [1] = 20;
        array1 [3] = 30;

        String [] catsName = {"Murka", "Mursik", "Rizhik"};

        array2 = new double [] {1.2, 3.4, 5.7};

        boolean [] isCatBlack = new boolean[] {true, false, true};

        array4 [0] = 'a';
        array4 [1] = 'b';
        array4 [2] = 'c';

        Cats [] cats = new Cats[] {cat1, cat2, cat3};*/


        String [] catName  = new String [8];
        catName [0] = "Murzik";
        catName [1] = "Chernish";
        catName [2] = "Rizhik";
        catName [3] = "Jinny";
        catName [4] = "Ashly";
        catName [5] = "Marfa";
        catName [6] = "Zirka";
        catName [7] = "Mashka";

     /*   for (int boxName = 0; boxName < catName.length; boxName++) {
            System.out.println(boxName);
        }*/
        // вывод данных при инициализации бокс нейм = длине масива (без -1 эксепшин)
        for (int boxName = catName.length - 1; boxName >= 0; boxName--) {
            System.out.println(catName [boxName]);
        }





    }


}
