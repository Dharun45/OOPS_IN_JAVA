/* Encapsulation 
Binding data (variables) and methods into a single unit(class) and protecting the data by restricting direct access. 
*/
public class BankAccount {
    
    // PRIVATE: Data is hidden/protected (cannot access directly)
    private double balance;
    private String accountNumber;
    private String pin;
    
    //  PUBLIC: Controlled access through methods (like ATM buttons)
    
    // Constructor to create account
    public BankAccount(String accNum, String pin, double initialBalance) {
        this.accountNumber = accNum;
        this.pin = pin;
        this.balance = initialBalance;
    }
    
    // Deposit money - anyone can deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }
    
    // Withdraw money - needs PIN validation (security!)
    public void withdraw(double amount, String enteredPin) {
        if (!this.pin.equals(enteredPin)) {
            System.out.println("Wrong PIN!");
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
    
    // Check balance - needs PIN
    public double getBalance(String enteredPin) {
        if (!this.pin.equals(enteredPin)) {
            System.out.println("Wrong PIN!");
            return -1;
        }
        return balance;
    }
    
    // Change PIN - needs old PIN (extra security)
    public void changePin(String oldPin, String newPin) {
        if (!this.pin.equals(oldPin)) {
            System.out.println("Wrong old PIN!");
            return;
        }
        this.pin = newPin;
        System.out.println(" PIN changed successfully!");
    }
}



public class Main {
    public static void main(String[] args) {
        // Create account
        BankAccount myAccount = new BankAccount("123456", "9999", 1000);
        
        // CANNOT do this (direct access blocked):
        // myAccount.balance = 999999;  // ERROR: balance has private access
        // myAccount.pin = "0000";      // ERROR: cannot access directly
        
        //  MUST use methods (controlled access):
        myAccount.deposit(500);                    // Works: +$500
        
        myAccount.withdraw(200, "9999");          // Works: correct PIN
        myAccount.withdraw(200, "1234");          // Fails: wrong PIN!
        
        double balance = myAccount.getBalance("9999");  // Works
        System.out.println("Balance: $" + balance);
        
        myAccount.changePin("9999", "4321");      // Change PIN
        myAccount.withdraw(100, "4321");          // Works with new PIN
    }
}
