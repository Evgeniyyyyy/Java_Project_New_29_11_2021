package task9_3;

public class Staff {
    task9_3.Person person = new Person("Rod", 27, "male", 500);
    task9_3.Person person1 = new Person("Lili", 24, "female", 200);
    task9_3.Person person2 = new Person("Kate", 31, "female", 100);

    Person[] getPerson = new Person[]{person, person1, person2};


    

    public int[] getSalary1() {
        int[] getPersonSalary = new int[getPerson.length];
        for (int i = 0; i < getPerson.length; i++) {
            getPersonSalary[i] += getPerson[i].getSalary();
        }
        return getPersonSalary;
    }
    public void printSalary() {
        getSalary1();
    }

}

