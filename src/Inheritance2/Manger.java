package Inheritance2;

import Inheritance.Animal;

public class Manger extends Human {
    String position;

    // Override
    int salary;

    @Override
    public void go() {
        System.out.println("slowly go");


    }
    @Override
    public void sal() {
        System.out.println("876");
    }

}
