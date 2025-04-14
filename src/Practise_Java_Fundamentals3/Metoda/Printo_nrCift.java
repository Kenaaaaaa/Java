package Practise_Java_Fundamentals3.Metoda;


/*4.	Krijo një metodë void printoNumratCift(int[] numra)
 që pranon një array të numrave dhe shfaq vetëm numrat çift.*/


import java.util.Scanner;

public class Printo_nrCift {

    //Metoda Array Nr Cift

    static void printoNumratCift(int[] numra){
        System.out.print("Nga numrat qe keni futur , numrat cift jane = ");
        for (int i=0;i<numra.length;i++){
            if(numra[i]%2==0){
                System.out.print( numra[i]+" ");

            }
        }

    }

    //Main
    public static void main(String[] args) {
        int j,nr;
        Scanner input= new Scanner(System.in);


        //Lexo sa numra do te fusi perdoruesi
        System.out.println("Shkruani sasine e numrave qe doni te futni ");
        nr=input.nextInt();

        int []tab= new int[nr];

        System.out.println("Fusni numrat qe doni");

        //Numrat e Perdoruesit i ruan ne tabele
        for( j=0;j<nr;j++){
            tab[j]=input.nextInt();

        }

        //Afisho vetem numrat cift qe ka futu perdoruesi
        printoNumratCift(tab);
    }
}
