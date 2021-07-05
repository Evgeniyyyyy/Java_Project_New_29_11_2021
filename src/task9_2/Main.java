package task9_2;

public class Main {


    public static void main(String[] args) {

   //     Person b = new Person();
        Person a = new Person("John", 30, "male");
    //    Person b = new Person("Silvia", 33, "female");
        Employee employee = new Employee("Bob", 34, "male", 100);
        Manager manager = new Manager("Linda", 24, "female", 100, 10);

        System.out.println(employee.getsName());
        System.out.println(a.getsName());


        Employee[] employeeArray = {employee, manager};
        System.out.println("Sum of salary employee and manager: $" + EmployeeUtils.getSumSalary(employeeArray));

    //    Employee[] employeeArray = new Employee[] {employee, employee1};





   //     System.out.println(employee1.getName());

       /* System.out.println(employee.isSameName(employee1));
        System.out.println(employee.person.name);
        System.out.println(employee1.isSameName(employee2));*/
       // System.out.println(this.person.name);
      //  System.out.println("_____________________________________________________________");

   //    System.out.println("Sum salary All employee: " + Salary.getSum(employeeArray));
    }


}
