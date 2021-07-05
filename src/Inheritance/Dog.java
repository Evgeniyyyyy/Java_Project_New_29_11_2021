package Inheritance;

import javax.swing.plaf.IconUIResource;


public class Dog extends Animal {
    String name = "Tom";

    @Override
    public void voice() {
        System.out.println("Guv!!");
    }
}
