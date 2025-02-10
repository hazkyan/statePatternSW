public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();  // Initial state when an account is created.
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(double amount) {
        accountState.deposit(this, amount);
    }

    public void withdraw(double amount) {
        accountState.withdraw(this, amount);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void close() {
        accountState.close(this);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
