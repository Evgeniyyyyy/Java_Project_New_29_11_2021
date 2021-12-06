package Overload_20121_OOP;

public class Kotik extends Person{
    String callGrandma = "Miauuu";
    int old = 3;

    public String getCallGrandma() {
        return callGrandma;
    }

    @Override
    public int getOld() {
        return old;
    }
}




