package HW.Task11_all;

public abstract class Employee {

    /*Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
            setBaseSalary
    getName - получить имя
    setName
    getSalary - получить зарплату*/
    private int baseSalary;
    private String name;
    private int salary;



    public Employee(int baseSalary, String name, int salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary1() {
        return this.salary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.baseSalary;
    }
}
