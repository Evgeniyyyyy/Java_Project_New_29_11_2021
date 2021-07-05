package HW.Task11_all;

import HW.Task10_all.BaseEmployee;

public final class Director extends BaseManger {
    public final static int VALUE = 9;

    public Director(int baseSalary, String name, int salary, int numberOfSubordinates) {
        super(baseSalary, name, salary, numberOfSubordinates);
    }

    @Override
    protected int getValue() {
        return VALUE;
    }

    /*public Director(String name, int age, char sex, int salary) {
        super(name, age, sex, salary);
    }*/

    /* Необходимо создать класс Director с теми же методами, что и Manager,
    но метод getSalary должен возвращать результат по формуле
        - <базовая ставка> * (<количество подчиненных> / 100 * 9).
    Если количество подчиненных 0, то результат как у обычного рабочего.*/

   /* @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {

            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }*/


}
