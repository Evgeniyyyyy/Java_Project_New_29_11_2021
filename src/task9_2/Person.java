package task9_2;

public class Person {
    protected String name;
    protected int age;
    protected String sex;

    public Person() {
        System.out.println("Person 1st constructor");
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("Person 2st constructor");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getsName() {
        if (sex == "male") {

            return "Mr. " + name;
        } else {

            return "Mrs. " + name;
        }
    }
}

