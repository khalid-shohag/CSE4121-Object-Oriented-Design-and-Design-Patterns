package FacadePattern;

public interface BankAccount {
    void deposit();
    void withdraw();
    void transfer(BankAccount account, int amount, int sourceAccountNumber, int destinationAccountNumber);
    int getAccountNumber();
}
