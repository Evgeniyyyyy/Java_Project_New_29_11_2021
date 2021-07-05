package HW;

public class Task3_3 {
    public static void main(String[] Args) {

        int a = 41;
        //    s = (a % 2 > 20);
        int range;
        /*    if (a > 10 && a <= 99) {
            System.out.println("a > 10");
        } else if (a >= 100) {
            System.out.println("a >= 100");
        } */

        /*    if ((a / 2 > 20) == true) {
        //    s = a % 2 > 20;
            System.out.println(" res / 2 > 20 ");
       //     s = a % 2 > 20;

            // b = a % 2 > 20;
        } */

        if (a > 10) {
            System.out.println(" Value > 10 ");
        }
        if (a < 100) {
            System.out.println(" Value < 100 ");
        }
        if (a / 2.0 > 20) {
            System.out.println(" результат деления на 2 больше 20 - если это соответствует истине ");
        }
        // значение переменной между 5 и 40 включительно - если это правда
        if ( a >= 5 && a == 40) {
            System.out.println(" значение переменной между 5 и 40 включительно - если это правда ");
        }
        // значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
        else
           {
            System.out.println(" значение переменной меньше 5 или больше 40 - если предыдущие условие ложное ");
        }
        }
    }

