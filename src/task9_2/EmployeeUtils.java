package task9_2;

public class EmployeeUtils {
    static int getSumSalary(Employee[] employeeArray) {
        int result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].getSalary();

        }
        return result;
    }
}
