// Lớp BankAccount
public class BankAccount {
    private String accountNumber;
    private double balance;
    private static final double MINIMUM_BALANCE = 50000;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance >= MINIMUM_BALANCE ? initialBalance : MINIMUM_BALANCE;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void debit(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Số dư không đủ để thực hiện giao dịch. Tài khoản phải có ít nhất " + MINIMUM_BALANCE);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// Lớp SavingAccount kế thừa từ BankAccount
public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        credit(interest); // Sử dụng phương thức credit thay cho deposit
    }

    public double getInterestRate() {
        return interestRate;
    }

}
