package Inheritance;

public class New {
    public static void main(String[] Args) {
        Kitty kitty = new Kitty();
        kitty.name = "Bob";
    //    kitty.callMammy = "ghgjhg";
        kitty.getCallMammy();

        System.out.println(kitty.name);
    //    System.out.println(kitty.callMammy);
    //    System.out.println(kitty.getCallMammy());

        Animal dog = new Dog();
        dog.name = "sdfsdfsd";
        System.out.println(dog.name);
        dog.voice();
    }

}
