package task9_2;

public class Manager extends Employee{

    private int workerCount;

    public Manager(String name, int age, String sex, int salary, int workerCount) {
        super(name, age, sex, salary);
        this.workerCount = workerCount;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + (int) (super.getSalary() * (workerCount / 100.0));
    }
}
