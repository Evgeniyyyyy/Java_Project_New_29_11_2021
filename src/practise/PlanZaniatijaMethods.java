package practise;

public class PlanZaniatijaMethods {

    public static void main(String[] args) {
        int r1 = powerOf2(5);
        int r2 = powerOf(r1);
        System.out.println(r2);

        System.out.println("After method completion");

        System.out.println("\n-------Power Functions--------\n");
        System.out.println(powerOf(2, 3));
        System.out.println(powerOf(6));
    }


    public static int powerOf2(int number) {
        int result = 0;
        result = number * number;
        return result;
    }

    // wil be return квадрат числа
    public static int powerOf(int number) {
        System.out.println("No power provided / Степерь не задана, я возвращаю степень числа: ");
        return powerOf2(number);
    }

    public static int powerOf(int number, int power) {

        int result = 1;
        for (int i = 1; i <= power; i++ ) {
            result = result * number;

        }
        return result;
    }
}
