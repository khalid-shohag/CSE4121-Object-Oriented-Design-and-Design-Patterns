package FacadePattern;

public class Saving implements BankAccount {
    int amount;
    Saving(int amount) {
        this.amount = amount;
    }
    @Override
    public void deposit() {
        System.out.println("Deposited Amount: "+amount);
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw amount: "+amount);
    }

    @Override
    public void transfer(BankAccount account, int amount, int sourceAccountNumber, int destinationAccountNumber) {
        System.out.println("Transfer amount: "+amount+" from account: "+sourceAccountNumber+" to: "+destinationAccountNumber);
    }
    @Override
    public int getAccountNumber() {
        return 58794;
    }
}
