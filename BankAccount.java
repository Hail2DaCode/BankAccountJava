import java.util.Random;


class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalAccountMoney = 0;
    private String accountNumber;
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts += 2;
        totalAccountMoney += checkingBalance + savingsBalance;
        accountNumber = BankAccount.createAccountNumber();
    }
    public String getAccountNumber () {
        return accountNumber;
    }
    public double getChecking() {
        return checkingBalance;
    }
    public double getSavings() {
        return savingsBalance;
    }
    public void addMoney(double checking, double savings) {
        checkingBalance = this.getChecking() + checking;
        savingsBalance = this.getSavings() + savings;
        totalAccountMoney = totalAccountMoney + checking + savings;
    }
    public void addMoney(double checking) {
        checkingBalance = this.getChecking() + checking;
        totalAccountMoney = totalAccountMoney + checking;
    }
    public void addMoney(String account, double amount) {
        if (account == "checking") {
        checkingBalance = this.getChecking() + amount;
        totalAccountMoney = totalAccountMoney + amount;

        }
        else if (account == "savings") {
        savingsBalance = this.getSavings() + amount;
        totalAccountMoney = totalAccountMoney + amount;
        }
        else {
            System.out.println("You need to type checking and savings for the first parameter");
        }
    }
    public void addMoney(String account, double  checking, double savings) {
        if (account == "both") {
            checkingBalance = this.getChecking() + checking;
            savingsBalance = this.getSavings() + savings;
            totalAccountMoney = totalAccountMoney + checking + savings;
        }
        else {System.out.println("Please put 'both' as a parameter if you want to deposit in both accounts.");}
    }
    public double withdrawMoney(String account, double amount) {
        checkingBalance = this.getChecking();
        savingsBalance = this.getSavings();
        if (account == "checking") {
            if (amount > this.getChecking()) {
                System.out.println("You do not have sufficient funds to make such a withdrawal");
            }
            else {
            checkingBalance -= amount;
            totalAccountMoney = totalAccountMoney - amount;
            }
            return checkingBalance;

        }
        else if (account == "savings") {
            if (amount > this.getSavings()) {
                System.out.println("You do not have sufficient funds to make such a withdrawal");
            }
            else {
            savingsBalance -= amount;
            totalAccountMoney = totalAccountMoney - amount;
            }
            return savingsBalance;

        }
        return checkingBalance;
    }
    public double getTotal() {
        return totalAccountMoney;
    }
    public int getNumberofAccounts() {
        return numberOfAccounts;
    }
    public static int getRandomNumber() {
        Random randMachine = new Random();
        int num = randMachine.nextInt(9);
        return num;
    }
    private static String createAccountNumber() {
        String newString = "";
        for(int i = 0; i < 10; i++) {
            int num = BankAccount.getRandomNumber();
            newString = newString + num;
        }
        return newString;
    }
}