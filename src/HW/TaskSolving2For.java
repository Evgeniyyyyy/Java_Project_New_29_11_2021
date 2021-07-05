package HW;

public class TaskSolving2For {
    public static void main(String[] Args) {
        /*0  1  2  3  4  5  6  7  8  9
             0  1  2  3  4  5  6  7  8
                0  1  2  3  4  5  6  7*/

        for (int i = 9; i >= 0; i--) {

            for (int j = 9; j > i; j--) {

                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}





