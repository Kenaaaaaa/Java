package Practise_Java_Fundamentals3.Array1D;


/*2.	Gjej produktet që kushtojnë më pak se 10 EUR
Jepet një array double[] cmime = {15.0, 7.5, 22.0, 9.0, 5.5}
(lexo te dhenat nga useri). Shfaq të gjitha çmimet nën 10 EUR.
*/


import java.util.Scanner;

public class Price_Less_10EUR {

    //Metoda qe shfaq produktet qe kushtojne me pak se 10 EUR

    static void AfishoProduktet(double[]cmimi){
        System.out.print("Cmimet nen 10 Euro jane : ");
        for(int i =0;i<cmimi.length;i++){
            if(cmimi[i]<10.0d){
                System.out.print( cmimi[i]+" ");
            }
        }
    }


    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Lexo sasine e cmimeve qe do fusi perdoruesi
        System.out.println("Sa cmime do fusni ?");
        int sasiaCmimeve=input.nextInt();

        // Krijo Array e Cmimeve
        double[]cmimi=new double[sasiaCmimeve];

        //Lexo cmimet nga perdoruesi
        System.out.println("Fusni cmimet qe doni");
        for(int i=0;i<cmimi.length;i++){
            cmimi[i]=input.nextDouble();
        }
        AfishoProduktet(cmimi);
    }
}
