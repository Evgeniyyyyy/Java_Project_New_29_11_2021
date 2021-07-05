import java.util.Random;
import java.util.Scanner;

public class HeadsAndTails {
    public static void main(String[] Args) {
        String yourGuess;
        int yourGuessNumber;
        int headOrTail;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your guess: ");
        yourGuess = scanner.next();
        scanner.close();


        if (!yourGuess.equals("head") && !yourGuess.equals("tail")) {
            System.out.println("Try again!");
            System.exit(0);
        }

    if (yourGuess.equals("head")){
        yourGuessNumber = 0;
    } else {
        yourGuessNumber = 1;
    }

        headOrTail = new Random().nextInt(2);
        System.out.println(headOrTail);

        if (headOrTail == yourGuessNumber) {
            System.out.println("You won!!!");

            } else {
                System.out.println("You Lost");
            }
        }
}






