package static_non_static_fields_and_nethods;

public class BankAccountDemo {
    public static void main(String[] args) {


        BankAccount a = new BankAccount();
        a.setAccountBalance(150.37);

        BankAccount b = new BankAccount();
        b.setAccountBalance(380.49);

        BankAccount.setInterestRate(3.20);



        System.out.println("First $: " + a.getAccountBalance());
        System.out.println("Second $: " + b.getAccountBalance());
        System.out.println("Interest Rate: " + BankAccount.getInterestRate());

        Test c = new Test("Yevhen", 25);
        System.out.println(c.name.length());
    }
}
