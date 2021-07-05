package HW.Task11_all;

public class Worker extends Employee{
    /*в классе, метод getSalary будет возвращать значение по формуле
        - <базовая ставка> * (<количество подчиненных> / 100 * 3).
    Если количество подчиненных 0, то результат как у обычного рабочего.*/

    public Worker(int baseSalary, String name, int salary) {
        super(baseSalary, name, salary);
    }
    public int getSalary(){
        return this.getBaseSalary();
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }
}



