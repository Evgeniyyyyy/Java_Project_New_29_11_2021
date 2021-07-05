package Calculator;

public class Calc extends Device {
    static {
        System.out.println("Calculator status: OK");
    }
    static final int SCREEN_DIGITS = 10;

    public static int getScreenDigits() {
        return SCREEN_DIGITS;
    }

    public int sum(int a, int b){
        return a + b;
    }


    public int divide(int a, int b){
        return a / b;
    }
}
