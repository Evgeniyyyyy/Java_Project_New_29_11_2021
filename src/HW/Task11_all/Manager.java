package HW.Task11_all;

public final class Manager extends BaseManger {


    /*Необходимо создать класс Manager в который нужно добавить следующие методы:
    getNumberOfSubordinates - получить количество подчиненных
            setNumberOfSubordinates
            в классе, метод getSalary будет возвращать значение по формуле
            - <базовая ставка> * (<количество подчиненных> / 100 * 3).
            Если количество подчиненных 0, то результат как у обычного рабочего.

            */
    // определяем константу
    public final static int VALUE = 3;

    public Manager(int baseSalary, String name, int salary, int numberOfSubordinates) {
        super(baseSalary, name, salary, numberOfSubordinates);
    }

    @Override
    protected int getValue() {
        return VALUE;
    }


    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public final int searchMaxDelta(Manager[] managers) {
        for (int i = 0; i < managers.length; i++)
            if (getNumberOfSubordinates() == 0) {
                return super.getSalary();
            }

        return (int) (getBaseSalary() - (getNumberOfSubordinates() / 100.0 * getValue()));

        }
    }


