package bank;

public class BankAccount {
    //поля
    private String owner;
    private double balance;

    //геттеры
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    //конструктор
    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0d;
    }

    //методы
    public void deposit(double amount) {
        if (amount < 0d) throw new IllegalArgumentException();
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount < 0d) throw new IllegalArgumentException();
        if (this.balance < amount) return false;
        else {
            this.balance -= amount;
            return true;
        }
    }

    public String toString() {
        return String.format("%-15s: %.2f", getOwner(), getBalance());
    }

    //статический метод
    public static boolean transfer(BankAccount src, BankAccount dest, double amount) {
        if (src.withdraw(amount)) {
            dest.deposit(amount);
            return true;
        }
        else return false;
    }




}
