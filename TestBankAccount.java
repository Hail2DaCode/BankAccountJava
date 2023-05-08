

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(200.00, 1000.00);
        BankAccount account2 = new BankAccount(400.00, 1300.00);
        System.out.println(account1.getTotal());
        account1.addMoney(500.00);
        System.out.println(account1.getTotal());
        System.out.println(account1.getNumberofAccounts());
        System.out.println(account1.getChecking());
        System.out.println(account1.getSavings());
        account1.addMoney("checking", 700.00);
        System.out.println(account1.getChecking());
        System.out.println(account1.getTotal());
        account1.addMoney(450.00, 450.00);
        System.out.println(account1.getChecking());
        System.out.println(account1.getSavings());
        System.out.println(account1.getTotal());
        account1.withdrawMoney("checking", 250.00);
        account1.withdrawMoney("savings", 250.00);
        System.out.println(account1.getChecking());
        System.out.println(account1.getSavings());
        System.out.println(account1.getTotal());
        // System.out.println(BankAccount.createAccountNumber());
        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());






    }
}
