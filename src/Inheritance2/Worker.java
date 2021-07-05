package Inheritance2;

public class Worker extends Human {
    String position;
    int salary = 10;

    @Override
    public void go() {
        System.out.println("run=ran-run");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
