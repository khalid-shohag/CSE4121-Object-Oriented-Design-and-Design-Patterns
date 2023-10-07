package FacadePattern;

import java.util.HashMap;

public class BankService {
    HashMap<Integer, BankAccount> bankAccount;

    BankService() {
        this.bankAccount = new HashMap<>();
    }

    int createNewAccount(String accountType, int amount) {
        BankAccount BA = null;
        if (accountType.equals("chequing"))
            BA =  new Chequing(amount);
        else if(accountType.equals("saving"))
            BA = new Saving(amount);
        else if(accountType.equals("investment"))
            BA = new Investment(amount);

        if(BA!=null) {
            this.bankAccount.put(BA.getAccountNumber(), BA);
            return BA.getAccountNumber();
        }
        return -1;
    }

    void transferMoney(int sourceAccountNumber, int destinationAccountNumber, int amount) {
        BankAccount sourceAccount = this.bankAccount.get(sourceAccountNumber);
        BankAccount destinationAccount = this.bankAccount.get(destinationAccountNumber);
        sourceAccount.transfer(destinationAccount, amount, sourceAccountNumber, destinationAccountNumber);
    }
}
