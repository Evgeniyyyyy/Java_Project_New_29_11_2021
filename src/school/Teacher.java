package school;

import static school.Data.*;

public final class Teacher extends BaseEmployee{
    private String subject;
    public int set;
    private double code;

    public String getSubject() {
        return subject;
    }

    public Teacher(String firstName, String lastName, char gender, int age, String status, String subject, int sets,
                   double code) {
        super(firstName, lastName, gender, age, status);
        this.subject = subject;
        this.set = sets;
        this.code = code;

    }
    public void printTeacher() {
        {
            System.out.println("Teacher: " + getFirstName() + " " + getLastName() + " subject: " + getSubject());

        }
    }

    public double getBaseSalary(){

        return 2 * BASE_HOURS_SET * HOURLY_WAGE_FOR_TEACHER;
    }
    public double getSalaryPerMonth(){

        double SalaryPerMonth = getBaseSalary() * 4 + FOR_TC_PER_WEEK * 4;
        return SalaryPerMonth;
    }

    @Override
    public double getSTaxes() {
        return getSalaryPerMonth() * 30/100;
    }

    @Override
    public double getSalary() {
        return getSalaryPerMonth() - getSTaxes();

    }
}
