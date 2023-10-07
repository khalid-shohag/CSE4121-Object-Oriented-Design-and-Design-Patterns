package FacadePattern;

public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        int customerSavingAccount = bankService.createNewAccount("saving", 500);
        System.out.println(customerSavingAccount);
        int customerInvestAccount = bankService.createNewAccount("investment", 700);
        System.out.println(customerInvestAccount);
        bankService.transferMoney(customerSavingAccount, customerInvestAccount, 225);
    }
}
