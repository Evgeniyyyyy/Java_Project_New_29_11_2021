package Interfaces.school;

public abstract class BaseAdministrator extends BasePerson implements ISalary {
    public BaseAdministrator(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }
}
