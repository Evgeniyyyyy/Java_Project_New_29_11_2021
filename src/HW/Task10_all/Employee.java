package HW.Task10_all;

public class Employee extends BaseEmployee{

    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex, salary);
    }

   /* @Override
    public int getSalary(Month[] monthArray) {
        int result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += monthArray[i].workDays * this.getSalary();

        }
        return result;

    }*/
}
