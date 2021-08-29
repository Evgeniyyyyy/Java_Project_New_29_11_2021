package RegExpression;

public class Runner {

    public static void main(String[] args) {
        Person person = new Person("Bob", "test@gmail.com", "0123454321");

        if (person.isFirstNameValid()){
            System.out.println("Is First name is valid");
        }
        else {
            System.out.println("Is First name is not valid");
        }
        if (person.isEmailValid()){
            System.out.println("Is email is valid");
        }
        else {
            System.out.println("Is email is not valid");
        }
    }
}
