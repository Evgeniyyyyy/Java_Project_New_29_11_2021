package task9_2;

public class Employee extends Person {

    protected String title;
    protected int salary;

    public Employee() {
        System.out.println("Employee 1st constructor");
    }

    public Employee(String name, int age, String sex, int salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        System.out.println("Employee 2st constructor");
    }

    public Employee(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
        System.out.println("Employee 3st constructor");
    }

    public boolean isSameName(Employee employee) {
        return employee.getName().equals(this.name);
    }

    // переопределение метода полиморфизм
    @Override
    public String getsName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
