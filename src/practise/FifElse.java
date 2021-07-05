package practise;

public class FifElse {
    public static void main(String[] Args) {

// вывести числа 0 <= number <= 10
        int number = 1;
        if (number > 0) {

            if (number % 2 == 0) {
                // 2, 4, 6, 8, 10
                if (number % 4 == 0) {
                    if (number > 5) {
                        System.out.println("Your number = 8");
                    } else System.out.println("Your number = 4");
                }
                if (number * 3 == 6) {
                    System.out.println("Your number = 2");
                } else if (number * 1 == 6) {
                    System.out.println("Your number = 6");
                }
            }
            if (number % 1 == 0) {
                // 1,3,5,7,9
                if (number % 3 == 0) {
                    // 3,9
                    if (number > 5) {
                        System.out.println("Your number = 9");
                    } else {
                        System.out.println("Your number = 3");
                    }
                }
                if (number != 7) {
                    if (number == 1) {
                        System.out.println("Your number = 1");
                    } else if (number == 5) {
                        System.out.println("Your number = 5");
                    }
                } else {
                    System.out.println("Your number = 7");
                }
            }
        } else {
            System.out.println("Your number = 0");
        }
    }
}










