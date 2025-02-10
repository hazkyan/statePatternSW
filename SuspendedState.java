public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        System.out.println("Deposits are not allowed on suspended accounts.");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("Withdrawals are not allowed on suspended accounts.");
    }

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
