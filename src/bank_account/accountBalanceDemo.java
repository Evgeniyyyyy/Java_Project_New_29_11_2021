package bank_account;

public class accountBalanceDemo {
    public static void main(String Args[]) {
        BankAccount a = new BankAccount();
        a.setAccountBalance(100.15);

        BankAccount b = new BankAccount();
        b.setAccountBalance(380.25);

        BankAccount.setGetInterestRate(3.75);

        System.out.println("First $: " + a.accountBalance);
        System.out.println("Second $: " + b.accountBalance);
        System.out.println("Interest Rate $: " + BankAccount.getGetInterestRate());
    }
}
