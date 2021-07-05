package practise;

public class LoopsPractise {
    public static void main(String[] Args) {

// 1 task
    /*    for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
// 2 Task
        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
       /* for (int i = 9; i >= 0; i--) {
            for (int j = 9; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();

        }*/
    }
}








