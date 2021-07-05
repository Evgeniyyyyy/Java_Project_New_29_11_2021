package takeout.utils;

import static takeout.utils.PrintUtils.CommonPrintMethods.*;


public class PrintUtils {
    private static final String LINE = "___________________";
    private static final String Maim_Dishes_Title = "Our Best Main Dishes";

    public static void print(String s) {
    }

    public static class CommonPrintMethods{

        public final static void print(String text) {
            System.out.print(text);
        }
        public final static void println() {
            System.out.println();
        }
        public static void printLine() {
            println();
            print(LINE);
        }

    }

    public static class PrintTitle{
        public static void printMenuTitle() {
            println();
            println();
            print("___________________take out Menu____________________");
            println();
            println();

        }
        public static void printMainDishesTitle() {
            print(Maim_Dishes_Title);
            println();
            println();
        }
        public static void printSidesTitle() {
            print("Our Healthy Sides");
            println();
            println();
        }
        public static void printDrinksTitle() {
            print("Our Best Drinks");
            println();
            println();
        }
    }




    public static void printPrice(double price) {
        if (price < 10) {
            print("$ " + price);
        }
        else {
            print("$" + price);
        }


    }

}
