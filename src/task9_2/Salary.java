package task9_2;

        /*Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
        и поле зарплата. Класс должен иметь метод isSameName(Employee employee)
        который возвращает true, если у сотрудника у которого был вызван метод и
        сотрудника который был передан как параметр, одинаковое имя.*/


public class Salary {
     static int getSum(Employee[] employeeArray) {

         int result = 0;
         for (int i = 0; i < employeeArray.length; i++) {
             result += employeeArray[i].salary;
         }
         return result;

    }
}
