package bank_account;

public class BankAccount {

    public static double getInterestRate;

    public static double getGetInterestRate() {
        return getInterestRate;
    }

    public static void setGetInterestRate(double getInterestRate) {
        BankAccount.getInterestRate = getInterestRate;
    }

    double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
