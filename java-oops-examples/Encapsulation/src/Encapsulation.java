





//          Encapsulation is bundling data with methods that operate on that data, and restricting direct access to some components.



/*
class BankAccount {
    private double balance;  // Private field

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    // No direct access to balance field
}

// Usage:
BankAccount account = new BankAccount();
account.deposit(1000);
System.out.println(account.getBalance());  // OK\



// System.out.println(account.balance);   // Error - private               */