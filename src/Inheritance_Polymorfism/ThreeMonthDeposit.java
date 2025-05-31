package Inheritance_Polymorfism;

public class ThreeMonthDeposit implements  Deposi{
    public double amount;

    @Override
    public double calculateInterest(double amount) {
     return amount*3;
    }
    public int calculateInterest(int amount) {
        return amount*3;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
