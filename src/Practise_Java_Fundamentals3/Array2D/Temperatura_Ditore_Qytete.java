package Practise_Java_Fundamentals3.Array2D;
/*2.	Temperatura ditore në 3 qytete gjatë javës
Jepet double[][] temperatura = new double[3][7]. Lexo temperaturat për 7 ditë në 3 qytete dhe gjej:
Qytetin me temperaturën mesatare më të lartë.
Ditën më të ftohtë në të 3 qytetet
*/


import Practise_Java_Fundamentals3.Array1D.Mesatare_Vizitoreve_Mujore;

import java.util.Scanner;

public class Temperatura_Ditore_Qytete {

    //Metoda Afisho temperaturat e futura nga perdoruesi
    static void AfishoTemperaturen(double[][]temperatura){
        for (int i=0;i<temperatura.length;i++){
            System.out.print("Temperatura per qytetin "+(i+1) +"-re ");
            for(int j=0;j<temperatura[i].length;j++){
                System.out.print( temperatura[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Metoda Temperatura Mesatare e Qyteteve
    static double[] Mesatare(double [][]temperatura){
        double mes;
        double[]tempMesQyteteve=new double[temperatura.length];

        for(int i=0;i<temperatura.length;i++){
            double sh=0;
            for(int j=0;j<temperatura[i].length;j++){
                sh+=temperatura[i][j];
            }
            mes=sh/temperatura[0].length;
            tempMesQyteteve[i]=mes;
        }
        return tempMesQyteteve;
    }


    //Metoda Max Temperaturave Mesatare
    static double[] MaxMesatare(double[]tempMesQyeteteve){
        double max=tempMesQyeteteve[0];
        int index=0;
        for (int i=0;i< tempMesQyeteteve.length;i++){
            if(tempMesQyeteteve[i]>max){
                max=tempMesQyeteteve[i];
                index=i;
            }
        }
        return new double[]{max,index};
    }


    //Metoda Dita me e Ftohte ne Tre Qytete

    static double[] MesDitore(double[][]temperatura){
        double[]mesTempDitore=new double[temperatura[0].length];
        double mes;
        for(int j=0;j< temperatura[0].length;j++){
            double sh=0;
            for(int i=0;i<temperatura.length;i++){
                sh+=temperatura[i][j];
            }
            mes=sh/temperatura.length;
            mesTempDitore[j]=mes;
        }
        return mesTempDitore;
    }




    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Deklaro dhe inicializo matricen
        double[][]temperatura= new double[3][7];

        //lexo temperaturat per 7 dite te javes per tre qytete
        System.out.println("Shkruaj temperaturat per tre qytete per secilen dite te javes");
        for(int i=0;i<3;i++){
            for(int j=0;j<7;j++){
                temperatura[i][j]=input.nextDouble();
            }
        }
        AfishoTemperaturen(temperatura);

        //Metoda Mesatare do te japi nje Array me 3 vlera mesatare te tre qyteteve
        //Afishimi i ketyre vlerave te Array nga Metoda
        double[]mesTemperaturave=Mesatare(temperatura);
        for(int i=0;i<mesTemperaturave.length;i++){
            System.out.println("Temperaturat mesatare per Qytetin  "+(i+1) +" jane "+ mesTemperaturave[i]);

        }

        double[]maxIndex=MaxMesatare(Mesatare(temperatura));
        System.out.println("Max i Mesatareve te temperaturave eshte "+ maxIndex[0]+ " i qytetit "+ (int)maxIndex[1]);


        //Afisho Ditën më të ftohtë në të 3 qytetet
        double[]tempMesatareDiteve= MesDitore(temperatura);
        double min=tempMesatareDiteve[0];
        int index=0;
        System.out.print("Dita me e ftohte ne 3 qytete eshte : ");
        for(int i=0;i<tempMesatareDiteve.length;i++){
            if(tempMesatareDiteve[i]<min){
                min=tempMesatareDiteve[i];
                index=i;
            }
        }
        System.out.println( index+1+" -te");

    }
}
