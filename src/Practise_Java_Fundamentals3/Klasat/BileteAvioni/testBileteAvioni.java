package Practise_Java_Fundamentals3.Klasat.BileteAvioni;

import java.util.Scanner;

public class testBileteAvioni {
    public static void main(String[] args) {

        //Krijojme nje objekt bosh ( nje kopje te klases)

        BileteAvioni bileta1=new BileteAvioni();
        Scanner input=new Scanner(System.in);
        System.out.println("Ku eshte destinacioni juaj ");
        bileta1.setDestination(input.next());
        System.out.println("Sa eshte cmimiBaze i Biletes");
        bileta1.setCmimiBaze(input.nextDouble());
        System.out.println("A ke bagazh? (true/false)");
        bileta1.setKaBagazh(input.nextBoolean());

        System.out.println("Cmimi Total i biletes tuaj eshte "+bileta1.cmimiFinal(bileta1.isKaBagazh(), bileta1.getCmimiBaze()));



        //Krijojme nje objekt duke i inicializuar direkt
        System.out.println("Ku eshte destinacioni juaj ");
        String destination=input.next();
        System.out.println("Sa eshte cmimiBaze i Biletes");
        double cmimiBaze=input.nextDouble();
        System.out.println("A ke bagazh? (true/false)");
        boolean kaBagazh=input.nextBoolean();

        BileteAvioni bileta2=new BileteAvioni(destination,cmimiBaze,kaBagazh);
        System.out.println("Cmimi Total i Biletes tuaj eshte "+ bileta2.cmimiFinal(kaBagazh,cmimiBaze));
    }
}
