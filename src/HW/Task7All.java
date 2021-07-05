package HW;

public class Task7All {


    public static void main(String[] Args) {

        System.out.println(countingSheep(4));
    }

       /* assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
        */

    public static String countingSheep(int num) {
        String result = " ";
        for (int i = 1; i <= num; i++) {
            result += i + "sheep...";
        }
        return result;
    }
}


       // Kata 4 min value search
       /* public class SmallestIntegerFinder {
            public static int findSmallestInt(int[] args) {
                int min = args[0];
                for (int i = 0; i < args.length; i++) {
                    if ( min > args[i]) {
                        min = args[i];

                    }

                }
                return min;
            }
        }*/

        // Tsk3 перевести с интеджер в стринг
        /*class Kata {
            public static String numberToString(int num) {
                // Return a string of the number here!
                return String.valueOf(num);
            }
        }*/





// System.out.println(str);
// System.out.println(str1);
//  System.out.println(str2);
// посчитать количество элементов в массиве
       /* int[][] arr = {{1, 2, 3}, {4, 7, 1} };
        int innerCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                innerCount += 1;
            }
        }
        System.out.println(innerCount);*/


//    isLove(2, 5);


// task2
// Напишите функцию, которая будет принимать количество
// лепестков каждого цветка и возвращать истину, если они влюблены, и ложь, если нет.

// BEST PRACTISE
        /*public static boolean isLove(final int flower1, final int flower2) {
            return flower1 % 2 != flower2 % 2;*/

        /*public static Boolean isLove ( final int flower1, final int flower2){
            return (flower1 % 2 == 0 && flower2 % 2 == 1) || (flower1 % 2 == 1 && flower2 % 2 == 0);*/

// my decision

       /* if (flower2 % 2 == 0) {
            //     System.out.println("even");
            return true;
        } else if (flower2 % 2 != 0) {
            //System.out.println("odd");
            return false;

        } else if (flower1 % 2 == 0) {
            //System.out.println("even");
            return true;
        } else if (flower1 % 2 != 0) {
            //  System.out.println("odd");
            return false;
        }*/















