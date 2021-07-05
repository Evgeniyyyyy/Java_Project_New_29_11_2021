package HW;

import task9_2.Employee;

public class Task9All {
    //Task1
    /*Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.*/
    public static void main(String[] args) {
        Task9Person1 r = new Task9Person1("Bob", 25, "male" );
        Task9Person1 r1 = new Task9Person1("Maria", 27, "female" );
        System.out.println(r.getName(r.name));
        System.out.println(r1.getName(r1.name));
        System.out.println("______________________________________________________________");



      //  task9Employee.setName("Rocky");
     //   task9Employee.setSalary(150);
   //     task9Employee.setAge(33);
   //     task9Employee.setSex("male");
      //  Task9Employee task9Employee1 = new Task9Employee();
    //    task9Employee1.setName("Rocky1");
    //    task9Employee1.isSameName(task9Employee1);

    }

    //Task2
    /*Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
    Класс должен иметь метод isSameName(Employee employee) который возвращает true,
    если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.*/
  /*  public static void main(String[] args) {
        Task9Employee task9Employee1 = new Task9Employee("Lucy", 31, "female", 1000);
        Task9Employee task9Employee2 = new Task9Employee("Luc", 22, "female", 50);


        System.out.println(task9Employee2.isSameName(task9Employee1));
    }
*/


}
