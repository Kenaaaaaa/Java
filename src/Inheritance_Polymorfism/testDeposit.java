package Inheritance_Polymorfism;

public class testDeposit {
    public static void main(String[] args) {
        Deposi deposit1 = new ThreeMonthDeposit();
        System.out.println(deposit1.calculateInterest(1800));
        double amountDouble = 1807.0;
        System.out.println(deposit1.calculateInterest(amountDouble));
        DepositAccount depositAccount=new DepositAccount("34343",43434.55,"deposite",8548535353.454);
        depositAccount2  depositAccount2=new depositAccount2("34343",43434.55,"deposite",8548535353.454,"sdfdsf");
    }
}
