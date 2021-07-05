package practise;

public class FIFELSE2attemp {
    public static void main(String[] Args) {

        // вывести числа 0 <= number <= 10
        int number = 9;

        if (number > 0) {
            if (number % 2 == 0) {
                if (number % 4 == 0) {
                    // 4,8
                    if (number > 5) {
                        System.out.println("Your number = 8");
                    } else {
                        System.out.println("Your number = 4");
                    }
                }
                //2,6,10
                if (number / 1 == 6) {
                    System.out.println("Your number = 6");
                } else if (number * 1 == 2) {
                    System.out.println("Your number = 2");
                } else if (number / 1 == 10) {
                    System.out.println("Your number = 10");
                }
            }
            if (number % 1 == 0) {
                if (number % 3 == 0) {
                    if (number > 5) {
                        System.out.println("Your number = 9");
                    }
                    else {
                        System.out.println("Your number = 3");
                    }
                }
                // 1,5,7
                if (number != 7) {
                  if (number == 1) {
                      System.out.println("Your number = 1");
                  }
                  else if (number == 5 ) {
                      System.out.println("Your number = 5");
                  }
                }
                else {
                    System.out.println("Your number = 7");
                }
            }
        } else {
            System.out.println("Your number = 0");
        }

    }
}
