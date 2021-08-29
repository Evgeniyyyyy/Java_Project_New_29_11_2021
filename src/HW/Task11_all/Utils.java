package HW.Task11_all;

import java.util.Objects;

public class Utils {
    /*Необходимо создать утилитарный класс со следующими методами:
    поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров*/

    //поиск сотрудника в массиве по его имени
    public static IEmployee findEmployee(String name, IEmployee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (Objects.equals(name, employeeArray[i].getName()))
                return employeeArray[i];

        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static IEmployee findNameEmployee(String name, IEmployee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().contains(name))
                return employeeArray[i];

        }
        return null;

    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int commonSalaryMembers(IEmployee[] employeeArray) {
        int result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].getSalary1();

        }
        return result;
    }

    //поиск наименьшей зарплаты в массиве
    public static int searchMinSalary(IEmployee[] employees) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (minValue > employees[i].getSalary1()) {
                minValue = employees[i].getSalary1();

            }

        }
        return minValue;
    }

    //поиск наибольшей зарплаты в массиве
    public static int searchMaxSalary(IEmployee[] employees) {
        int minValue = Integer.MIN_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (minValue < employees[i].getSalary1()) {
                minValue = employees[i].getSalary1();

            }

        }
        return minValue;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int searchMinNumberEmployee(Manager[] managers) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (minValue > managers[i].getNumberOfSubordinates())
                minValue = managers[i].getNumberOfSubordinates();

        }
        return minValue;

    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int searchMaxNumberEmployee(Manager[] managers) {
        int minValue = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (minValue < managers[i].getNumberOfSubordinates())
                minValue = managers[i].getNumberOfSubordinates();

        }
        return minValue;

    }

    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    /*public static int searchMaxDelta(Manager[] managers) {
        int result = 0;

        for (int i = 0; i < managers.length; i++) {
            if ()
            result = managers[i].searchMaxDelta(managers) - managers[i].getBaseSalary();
        }
        return result;


    }*/
}










