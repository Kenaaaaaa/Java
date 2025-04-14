package Practise_Java_Fundamentals3.Metoda;

/*Krijo nje metode qe merr cmimin fillestar dhe perqindjen e zbritjes dhe kthen cmimin perfundimtar*/


import java.util.Scanner;

public class Cmimi_Final_meZbritje {

    //Metoda qe llogarit Cmimin Final me zbritje

    static double cmimiPerfundimtar(double cmimFillestar, double perqZbritje){
       double cmPerfundimtar=cmimFillestar-cmimFillestar*perqZbritje/100;
        return cmPerfundimtar;
    }


    //Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cmFillestar, perqZbritje;
        //Merr cmimin fillestar nga perdoruesi
        System.out.println("Fut cmimin fillestar ");
        cmFillestar=input.nextDouble();

        // Merr perqindjen e zbritjes
        System.out.println("Fut perqindjen e zbritjes ");
        perqZbritje=input.nextDouble();

        //Afisho cmimin perfundimtar duke thirrur metoden
        System.out.println("Cmimi perfundimtar "+ cmimiPerfundimtar(cmFillestar,perqZbritje));

    }
}
