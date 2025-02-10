public interface AccountState {
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
}
