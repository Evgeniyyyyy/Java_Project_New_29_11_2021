package practise;

public class RPerson {

    String name;
    int age;
    char sex;

       /* oop.Person (String name_, int age_, char sex_) {
                name = name_;
                age = age_;
                sex = sex_;*/

    Car car;

    public RPerson(String name, int age, char sex, Car car) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.car = car;
        System.out.println("dfsdfs");
    }


    String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        }
        else {
            return "Mrs. " + name;
        }
    }
}

