package Practise_Java_Fundamentals3.Array2D;

/*1.	Analizë shitjesh mujore për 4 produkte
Jepet int[][] shitje = {{10,12,9},{8,7,6},{15,14,13},{5,9,11}}
ku çdo rresht është një produkt dhe kolonat janë muajt.
 Gjej dhe afisho totalin për çdo produkt dhe për çdo muaj.
*/


import java.util.Arrays;
import java.util.Scanner;

public class Analize_Shitjesh_Mujore {

    //Metoda Totali Shitjeve per Cdo Produkt
    static int[] totaliShitjeveProdukt(int[][]shitje) {

        int  [] TotaliProdukt = new int[shitje.length];

        for (int i = 0; i < shitje.length; i++) {
            int sh = 0;
            for (int j = 0; j < shitje[i].length; j++) {
                sh += shitje[i][j];
            }
            TotaliProdukt[i] = sh;
        }
        return TotaliProdukt;
    }



        //Metoda Totali Shitjeve per Cdo Muaj

    static int[] TotaliShitjeveMuaj(int[] [] shitje){

        //deklarojme dhe inicializojme Array qe do te mbaje shitjet per cdo muaj
        int[]TotalMuaj=new int[shitje[0].length];

        //shitjet do te behen 0 per cdo muaj

        for(int j=0;j<shitje[0].length;j++){
            int sh=0;
            for(int i=0;i<shitje.length;i++){
                sh+=shitje[i][j];
            }
            TotalMuaj[j]=sh;
        }
        return TotalMuaj;
    }

        //Main
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            //Sa produkte do fusni
            System.out.println("Sa produkte keni ?");
            int nrRreshtave=input.nextInt();

            //Sa muaj jane
            System.out.println("Sa muaj ke shitje?");
            int nrShtyllave=input.nextInt();

            //Deklaro dhe Inicializo Matricen
            int[][] shitje=new  int[nrRreshtave][nrShtyllave];

            System.out.println("Per secilin produkt fusni sa  keni shitur cdo muaj");
            for(int i=0;i<shitje.length;i++){
                for(int j=0;j<shitje[i].length;j++){
                    shitje[i][j]=input.nextInt();
                }
            }
            //Afishimi i Array ne sout Arrays.toString duhet bere konvertimi i Array ne String

            System.out.println("Totali i shitjeve per produkt = "+ Arrays.toString(totaliShitjeveProdukt(shitje)));
            System.out.println("Totali i shitjeve per muaj = "+Arrays.toString(TotaliShitjeveMuaj(shitje)));
        }
    }
