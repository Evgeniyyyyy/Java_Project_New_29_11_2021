package Overload_20121_OOP;

public class Person extends Animal{
    String name;
    String catBreed;
    int old;

    @Override
    public void voice(){
        System.out.println("Miiiiau");
    }

    public String getName() {
        return name;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public int getOld() {
        return old;
    }






    }

