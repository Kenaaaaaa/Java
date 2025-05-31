package Inheritance_Polymorfism;

public class depositAccount2 extends DepositAccount{
    String adress;

    public depositAccount2(String numberid,double balance,String type,double interestRate,String adress) {
        super(numberid,balance,type,interestRate);
        this.adress=adress;
    }
    public depositAccount2() {
        super  ();
    }
}
