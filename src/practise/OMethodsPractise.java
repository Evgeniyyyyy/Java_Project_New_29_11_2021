package practise;

import java.util.Arrays;

public class OMethodsPractise {
   /* public static String[] getName() {

        String firstName = "Anna";
        String lastName = "Orlova";
        return new String[]{firstName, lastName};

    }

    public static void greeting(String firstName, String lastName, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello" + " " + firstName + lastName + "!");
            System.out.println("Welcome!");
        }
    }*/

        /*public static void main (String[]Args){
            String[] name = getName();
            System.out.println(Arrays.toString(getName()));

            greeting("John", "Doe", 2);
        }*/

    public static Boolean isZero(int number) {
        if (number == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isZero(4));
    }
}

