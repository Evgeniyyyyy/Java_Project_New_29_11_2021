package HW.Task11_all;

public class Worker implements IEmployee{
    /*в классе, метод getSalary будет возвращать значение по формуле
        - <базовая ставка> * (<количество подчиненных> / 100 * 3).
    Если количество подчиненных 0, то результат как у обычного рабочего.*/
    private int baseSalary;
    private String name;
    private int salary;

    public Worker(int baseSalary, String name, int salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int getSalary1() {
        return 0;
    }

    @Override
    public final int getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}



