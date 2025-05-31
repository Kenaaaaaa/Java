package Inheritance_Polymorfism;

public class DepositAccount extends Account{
    double interestRate;

    public DepositAccount(String Numberid, double balance, String type, double interestRate) {
        super(Numberid, balance, type);
        this.interestRate = interestRate;
    }

    public DepositAccount() {
        super();
    }
    @Override
    public void Deposit(double amount) {
        amount= amount + (amount * interestRate);
    }
}
