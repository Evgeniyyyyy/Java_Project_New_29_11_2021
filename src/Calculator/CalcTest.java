package Calculator;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.sum(2, 3) == 5);
        System.out.println(calc.sum(-2,-2) == -4);
        System.out.println(calc.sum(0,-3) == -3);
        System.out.println(calc.sum(0,0) == 0);
        System.out.println(calc.sum(5,0) == 5);
    }
}
