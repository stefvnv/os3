/**
 * Lab 2 - Locks
 * Bank class
 * Stefana Chiritescu
 * A00282343
 */

public class Bank {
    public double balance;

    public Bank() {
        this.balance = 799.99;
    }

    synchronized public void addAmount() {
        this.balance += 1000;
    }

    synchronized public void subtractAmount() {
        this.balance -= 1000;
    }

    synchronized public double getBalance() {
        return balance;
    }
}
