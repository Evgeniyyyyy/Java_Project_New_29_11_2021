package HW.Task10_all;

public class Main {
    public static void main(String[] Args) {
        Month[] months = MonthUtils.getQ1();
        months[0] = null;

        Employee employee = new Employee("Bob", 27, 'M', 10);

        System.out.println("Sum Q1 salary: " + employee.getSalary(MonthUtils.Q1));
        System.out.println("Sum one month salary: " + employee.getSalary(new Month[]{MonthUtils.MAR}));
        System.out.println("______________________________________________________________");

        Manager manager = new Manager("Rambo", 30, 'M', 100, 10);
      //  System.out.println("К рассч ЗП приб по 1% за каждого подчин: " + manager.getSalary(new Month[]{MonthUtils.JAN}));

    //    System.out.println(employee.);
        // получение объекта
        System.out.println(MonthUtils.getQ1());
        System.out.println(MonthUtils.MAR);




    }
}
