package task9_3;

import task9_2.Employee;

import java.lang.reflect.Array;

public class Person {
   public String name;
  public   int age;
    String sex;
  public int salary;

    public Person(String name, int age, String sex, int salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }
}
