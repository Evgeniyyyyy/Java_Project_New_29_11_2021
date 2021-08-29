package HW.Task11_all;

public class Main {
    public static void main(String[] args) {
               Manager manager1 = new Manager(100, "Bob", 10, 5);
        Director director = new Director(100, "Rob", 10, 3);
       // IEmployee employee = new IEmployee(100, "Lob", "test");
        System.out.println("Manager: $" + manager1.getSalary());
        System.out.println("Director: $" + director.getSalary());

     //   IEmployee[] employeeArray = new IEmployee[]{employee, manager1, director};
 /*       Manager manager1 = new Manager(100, "Jo", 10, 20);
        Manager manager2 = new Manager(100, "Kevin", 8, 10);
        Manager manager3 = new Manager(100, "Elvis", 3, 30);*/
      //  Director director = new Director(100, "Rob", 10, 30);
   //     Employee employee = new Employee(100, "Lob", 15);


        /*Employee[] employeeArray = { manager1};
        Manager[] managers = {manager1, manager2, manager3};*/
       /* System.out.println("Search employees which contains employees name :" + Utils.findEmployee("Lob", employeeArray));
        System.out.println("Search employees which contains similar string :" + Utils.findNameEmployee("j", employeeArray));
        System.out.println("Sum of salary all employees: $" + Utils.commonSalaryMembers(employeeArray));
        System.out.println("Min value salary against all employees: $" + Utils.searchMinSalary(employeeArray));
        System.out.println("Max value salary against all employees: $" + Utils.searchMaxSalary(employeeArray));
        System.out.println("Min number sub employee against all sub employee: " + Utils.searchMinNumberEmployee(managers));
        System.out.println("Max number sub employee against all sub employee: " + Utils.searchMaxNumberEmployee(managers));*/
   //     System.out.println(Utils.searchMaxDelta(managers));



    }
}
