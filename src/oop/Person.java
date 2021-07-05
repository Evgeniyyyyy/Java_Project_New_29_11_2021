package oop;

import practise.Car;

import static oop.Utils.*;

public class Person {

    private String person;
    private String firstname;
    private String lastname;
    private int age;

    Person(boolean isStudent, String firstname, String lastname, int age) {
        this.setPerson(isStudent);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.age = age;

    }

    public void setPerson(boolean isStudent) {
        if (isStudent) {
            this.person = "Student";
        } else {
            this.person = "Teacher";
        }
    }

    public void setFirstname(String firstname) {
        if (this.firstname != "") {
            this.firstname = firstname;
        } else {
            System.out.println("Not valid First name");

        }
    }

    public void setLastname(String lastname) {
        if (this.lastname != "") {
            this.lastname = lastname;
        } else {
            System.out.println("Not valid Last name");

        }
    }

    public void setAge(int age) {
        if (person.equals("Student")) {
            if (age >= 5 && age <= 18) {
                this.age = age;
            } else {
                System.out.println("Not valid age");
                this.age = 0;
            }
        } else if (person.equals("Teacher")) {
            if (age >= 19 && age <= 60) {
                this.age = age;
            } else {
                System.out.println("Not valid age");
                this.age = 0;
            }

        } else {
            System.out.println("!!! Can't recognize person");
        }


    }

    public String getPerson() {
        return person;

    }


    public void printCard() {
        printLine();
        if (person.equals("Student")) {
            System.out.println("Student");
        } else if (person.equals("Teacher")) {
            System.out.println("Teacher");
        }


        System.out.println(firstname + " " + lastname + ", " + age);

    }

}





       /* public Person(String name, int age, char sex, Car car) {
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
        }*/

