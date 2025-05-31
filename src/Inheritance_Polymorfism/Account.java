package Inheritance_Polymorfism;

public class Account {
    String Numberid;
    double balance;
    String type;


    Account(String Numberid, double balance, String type) {
        this.Numberid = Numberid;
        this.balance = balance;
        this.type = type;
    }
    Account() {}

    public void Deposit(double amount) {
        balance = balance + amount;
    }
}
