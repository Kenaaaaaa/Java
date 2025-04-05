package Leksioni5;

import java.util.Scanner;

public class Nr_tek_2D {
    public static void main(String[] args) {

        //Lexo numrat nga perdoruesi

        Scanner input=new Scanner(System.in);

        //Pyesim sa rreshta dhe kolona do
        System.out.println("Sa rreshta do ?");
        int nr_rreshtave=input.nextInt();

        System.out.println("Sa kolona do ?");
        int nr_kolonave=input.nextInt();

        // Krijojme nje array

        int i,j;
        int count=0;
        double[][] vlera=new double[nr_rreshtave][nr_kolonave];

        for (i=0;i<vlera.length;i++) {
            for (j = 0; j < vlera[i].length; j++) {
                System.out.println("Fut vlerat double");
                vlera[i][j] = input.nextDouble();

            }
        }

        for (i=0;i<vlera.length;i++){
            for(j=0;j<vlera[i].length;j++){

                if(vlera[i][j]%2!=0.0d){
                    count++;
                }

            }
        }
            System.out.println("Jane "+ count+" nr tek ");
        }
    }

