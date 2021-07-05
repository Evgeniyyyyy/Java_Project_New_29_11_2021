package HW;
/*Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
  Класс должен иметь метод isSameName(Employee employee) который возвращает true,
  если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.*/

import ticket.Person;

import java.util.Objects;

public class Task9Employee {

    Task9Person1 task9Person1;

    int salary;

    public Task9Employee(String name, int age, String sex, int salary) {
      //  this.task9Person1 = new Task9Person1(name, age, sex);
        this.salary = salary;


      /*  boolean isSameName(Task9Employee task9Employee) {
        // Чтобы улавливать эксепшин если пустое имя;
        // return Objects.equals(task9Employee.task9Person1.name, this.task9Person1.name);

            if (task9Employee.task9Person1.name.equals(this.task9Person1.name)) {
                return true;
            }
            else {
                return false;

            }
        }

*/
    }
}

