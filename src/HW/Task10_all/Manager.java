package HW.Task10_all;

public final class Manager extends BaseEmployee{
    private int numberWorkers;

    public Manager(String name, int age, char sex, int salary, int numberWorkers) {
        super(name, age, sex, salary);
        this.numberWorkers = numberWorkers;
    }

    public int getNumberWorkers() {
        return numberWorkers;
    }

    public void setNumberWorkers(int numberWorkers) {
        this.numberWorkers = numberWorkers;
    }

    /*@Override
    public int getSalary() {
        return super.getSalary() + (int) (super.getSalary() * (numberWorkers / 100.0));
    }*/

    @Override
    public int getSalary(Month[] monthArray) {
       int result = super.getSalary(monthArray);
       result += result * (getNumberWorkers() / 100.0);

        return result;
    }
}
