package oop;

import static oop.Utils.*;

public class Teacher extends Person {


    //  private boolean isTeacher;
    private String subject;

    Teacher(boolean isStudent, String firstname, String lastname, int age, String subject) {
        super(isStudent, firstname, lastname, age);
        this.setSubject(subject);

    }


    public void setSubject(String subject) {
        if (getPerson().equals("Teacher")) {
            this.subject = subject;
        } else {
            this.subject = null;
        }
    }

    public void printTeacherCard() {
        printCard();
        System.out.println(subject);
        printLine();
    }
}




   /* Teacher(boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    Teacher(String firstName, String lastName, int age, boolean isTeacher, String subject) {

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setIsTeacher(isTeacher);
        this.subject = subject;

    }

    Teacher(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public boolean getIsTeacher() {
        return isTeacher;
    }

    public void setFirstName(String firstName) {
        if (firstName != "") {
            this.firstName = firstName;
        } else {
            System.out.println("Not valid firstName");
        }
    }

    public void setLastName(String lastName) {
        if (lastName != "") {
            this.lastName = lastName;
        } else {
            System.out.println("Not valid lastName");
        }
    }

    public void setAge(int age) {
        if (age >= 21 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Not eligible age");
            this.age = 0;
        }
    }

    public void setSubject(String subject) {
        if (isTeacher = false) {
            this.subject = null;
        } else {
            this.subject = subject;
        }
    }

    public void setIsTeacher(boolean isTeacher) {
        if (age == 0) {
            this.isTeacher = false;
        } else {
            this.isTeacher = isTeacher;

        }
    }

    public void printCard(String firstName, String lastName, int age, boolean isTeacher, String subject) {
        System.out.println("________________________________");
        if (isTeacher) {
            System.out.println("Teacher");
        }

        System.out.println(firstName + " " + lastName + ", " + age);
        System.out.println(subject);
        System.out.println("________________________________");
    }*/



