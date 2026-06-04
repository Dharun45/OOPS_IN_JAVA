/* Encapsulation 
Binding data (variables) and methods into a single unit(class) and protecting the data by restricting direct access. 
*/
/* The rule is simple: make fields private, expose them through public getters and setters.
Why it matters:
Protects data from unintended modification
Gives you control over what gets in and out
Makes the code maintainable and secure */

class BankAccount {
    private String accountHolder;
    private double balance;        // Cannot be accessed directly from outside
    private String accountNumber;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter - controlled read access
    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // No direct setter for balance — only controlled operations allowed
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", "ACC1001", 5000);

        // acc.balance = 100000;  // ERROR! balance is private — encapsulation protects it

        acc.deposit(2000);
        acc.withdraw(1000);
        System.out.println("Balance: ₹" + acc.getBalance());
    }
}
