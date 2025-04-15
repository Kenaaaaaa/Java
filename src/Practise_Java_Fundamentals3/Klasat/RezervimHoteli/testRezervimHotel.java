package Practise_Java_Fundamentals3.Klasat.RezervimHoteli;


import java.util.Scanner;

public class testRezervimHotel {
    public static void main(String[] args) {
        //Ndertojme nje objekt nisur nga konstruktori bosh
        RezervimHotel rezervimi1= new RezervimHotel();
        Scanner input= new Scanner(System.in);
        System.out.println("Emri juaj :");
        rezervimi1.emri= input.next();
        System.out.println("Sa nete do qendroni ? ");
        rezervimi1.netet= input.nextInt();
        System.out.println("Cmimi per nete");
        rezervimi1.cmimi=input.nextDouble();

        System.out.println("Cmimi total per rezervimin 1 = "+rezervimi1.totalCmimi(rezervimi1.netet, rezervimi1.cmimi));


        //Ndertojme nje objekt nisur nga konstruktori me Parametra

        System.out.println("Emri juaj:");
        String emri=input.next();
        System.out.println("Sa nete do qendroni? ");
        int netet=input.nextInt();
        System.out.println("Sa eshte cmimi per nete ?");
        double cmimi=input.nextDouble();

        RezervimHotel rezervimi2= new RezervimHotel(emri,netet,cmimi);
        System.out.println("Cmimi total per rezervimin 2 = "+rezervimi2.totalCmimi(netet,cmimi));
    }


}
