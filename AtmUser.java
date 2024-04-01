public class AtmUser{

private double balance;
private String name;

public double getBalance() {
    return balance;
}

public String getName() {
    return name;
}

public void setBalance(double balance) {
    this.balance = balance;
}

public void setName(String name) {
    this.name = name;
}

public boolean withdrawal(double amount) {
    if (amount <= balance) {
        balance -= amount;
        return true;
    } else {
        return false;
    }
}

public void deposit(double amount) {
    balance += amount;
}
}