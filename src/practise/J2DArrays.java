package practise;

public class J2DArrays {
    public static void main(String[] args) {

        int[] catAges = {3, 2, 4, 1, 7, 6};


        String[] catName = new String[8];
        catName[0] = "Murzik";
        catName[1] = "Chernish";
        catName[2] = "Rizhik";
        catName[3] = "Jinny";
        catName[4] = "Ashly";
        catName[5] = "Marfa";
        catName[6] = "Zirka";
        catName[7] = "Mashka";


        String[] catColors = new String[8];
        catColors[0] = "Gray";
        catColors[1] = "Black";
        catColors[2] = "Red";
        catColors[3] = "Yellow";
        catColors[4] = "White";
        catColors[5] = "Gold";
        catColors[6] = "Red";
        catColors[7] = "Green";

// среднее арифм массива
       /* int res = 0;
        for (int i = 0; i < catAges.length; i++) {

        }
        System.out.println(res + catAges.length / 2);*/


        int[] catAges1 = {3, 2, 4, 1, 7, 6, 4, 3};
        // int[] to String
        String[] catAgesString = new String[8];

        for (int i = 0; i < catAges1.length; i++) {
            catAgesString[i] = String.valueOf(catAges1[i]);
         //   System.out.println(catAgesString[i]);
        }

       /*   if (catAgesString[0].equals(catAges1[0])) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }*/

        // String to int
        String numberString = "3431";
        int number = 1;
        int numberInt = Integer.parseInt(numberString);
        System.out.println(numberInt);
        if (number == numberInt) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // String[] to int


        int[] catAgesInt = new int[8];
        for (int i = 0; i < catAgesString.length; i++) {

            catAgesInt[i] = Integer.parseInt(catAgesString[i]);
            System.out.print(catAgesInt[i] + " ");
        }

        // String to double
        double numberDouble = Double.parseDouble(numberString);
        System.out.print(numberDouble);




       /* String[][] cats = new String[3][8];

        for (int row = 0; row < 3; row++) {
            for (int cell = 0; cell < 8; cell++) {
                if (row == 0) {
                    cats[row][cell] = catName[cell];
                } else if (row == 1) {
                    cats[row][cell] = catAgesString[cell];
                } else if (row == 2) {
                    cats[row][cell] = catColors[cell];
                }
                System.out.println(cats[row][cell]);
            }
        }

        for (int cell = 0; cell < 8; cell++) {
            for (int row = 0; row < 3; row++) {
                System.out.println();
                System.out.println(cats[row][cell]);
            }
            System.out.println("_____________________");*/
        }
    }





