package oop;

public class Student extends Person{


    private int grade;

    Student(boolean isStudent, String firstname, String lastname, int age, int grade) {
        super(isStudent, firstname, lastname,age);
        this.grade = grade;
    }


    /*Student(String firstname, String lastname, int age, boolean isStudent, int grade) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setAge(age);
        this.setIsStudent(isStudent);
        this.setGrade(grade);

    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }


    public boolean getIsStudent() {
        return isStudent;
    }

    public int getGrade() {
        return grade;
    }

    public void setFirstname(String firstname) {
        if (firstname != "") {
            this.firstname = firstname;
        } else {
            System.out.println("Not valid name.");
        }
    }

    public void setLastname(String lastname) {
        if (lastname != "") {
            this.lastname = lastname;
        } else {
            System.out.println("Not valid name.");
        }

    }

    public void setIsStudent(boolean isStudent) {

        if (age == 0) {
            this.isStudent = false;
        } else if (isStudent = false) {
            this.isStudent = false;
        } else {
            this.isStudent = true;
        }
    }


    public void setGrade(int grade) {
        if (isStudent) {
            this.grade = grade;

        } else {
            this.grade = -1;
        }
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 18) {
            this.age = age;
        } else {
            System.out.println("Not eligible age");
            this.age = 0;
        }

    }

    public void printData(String firstname, String lastname, int age, boolean isStudent, int grade) {
   //     System.out.println("_____________________________");
        if (isStudent) {
            System.out.println("Student");
        }
        System.out.println(firstname + " " + lastname + ", " + age + " " + isStudent);
        System.out.println(grade + " " + "grade");
        System.out.println("_____________________________");
    }*/
}




