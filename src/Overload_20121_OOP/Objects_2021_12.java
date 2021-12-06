package Overload_20121_OOP;

public class Objects_2021_12 {
    public static void main(String[] args) {
        Kotik k = new Kotik();
        k.callGrandma = "ouuu";
        System.out.println(k.getCallGrandma());


        Animal dog = new Dog();
        System.out.println(dog.name);
        dog.voice();

    }
}





