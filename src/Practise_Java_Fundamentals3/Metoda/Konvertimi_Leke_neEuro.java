package Practise_Java_Fundamentals3.Metoda;


/*3.	Konvertimi i vlerës nga euro në lekë
Krijo një metodë që merr një shumë në euro dhe e kthen në lekë, duke përdorur një kurs të caktuar konvertimi.
*/


import java.util.Scanner;

public class Konvertimi_Leke_neEuro {

    //Metoda e Konvertimit nga Euro ne Leke

    static double KonvEuroLeke(double euro, double kursiKonvertim){
        double leke;
        leke=euro*kursiKonvertim;
        return leke;
    }


    //Main
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double eur, kursi;

        //Lexo shumen ne Euro
        System.out.println("Fut shumen ne Euro");
        eur=input.nextDouble();

        //Lexo Kursin e Kembimit
        System.out.println("Fut Kursin e Kembimit");
        kursi=input.nextDouble();

        //Afisho shumen ne Leke
        System.out.println("Shuma e konvertuar ne leke = "+ KonvEuroLeke(eur,kursi));
    }
}
