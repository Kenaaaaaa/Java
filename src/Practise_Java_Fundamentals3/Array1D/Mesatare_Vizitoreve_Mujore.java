package Practise_Java_Fundamentals3.Array1D;

/*	Llogarit mesataren mujore të vizitorëve në një faqe
    */

import java.util.Scanner;

public class Mesatare_Vizitoreve_Mujore {

    //Metoda Mesatare Vizitoreve
    static double Mesatare(int[]vizitore){
        double mes,sh=0;
        for(int i=0;i<vizitore.length;i++){
            sh+=vizitore[i];
        }
        mes=sh/vizitore.length;
        return mes;
    }


    //Main
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //Lexo numrin e diteve qe ka muaji
        System.out.println("Sa dite ka muaji ?");
        int nrDiteve=input.nextInt();

        //Deklaro dhe Inicializo Array
        int[]vizitore=new int[nrDiteve];

        //Lexo sa vizitore ka pasur cdo dite
        System.out.println("Shkruaj sa vizitore ka pasur cdo dite ");
        for(int i=0;i<vizitore.length;i++){
            vizitore[i]=input.nextInt();
        }

        System.out.println("Mesatarja e vizitoreve eshte = "+ Mesatare(vizitore));
    }
}
