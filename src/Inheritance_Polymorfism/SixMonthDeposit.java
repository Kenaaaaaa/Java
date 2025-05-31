package Inheritance_Polymorfism;

public abstract class SixMonthDeposit implements Deposi{

    @Override
    public double calculateInterest(double amount){
        return amount * 0.05;
    }
    public int calculateInterest(int amount) {
        return (int) (amount * 0.05);
    }
}
