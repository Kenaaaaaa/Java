package Practise_Java_Fundamentals3.Metoda;



/* 	Krijo një metodë void printoMesataren(double[] nota)
 që pranon një array me nota dhe shfaq mesataren e tyre. */


import java.util.Scanner;

public class Mesatarja_Notave {

    //Metoda per Mesataren e Notave

    static void PrintoMesataren(double[]nota){
        double mesatarja,sh=0;
        for(int i=0;i<nota.length;i++){
            sh+=nota[i];
        }
        mesatarja=sh/nota.length;
        System.out.println("Mesatarja e notave = "+mesatarja);
    }

    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        //Fut sa nota do te fusesh
        System.out.println("Sa nota do te futesh ");
        int nr_notave=input.nextInt();

        //Krijojme tablen Nota qe do te mbaje notat qe do fusi perdoruesi
        double[]nota=new double[nr_notave];

        //Lexo notat nga perdoruesi
        System.out.println("Fut notat qe ka marre");
        for(int i=0;i<nr_notave;i++){
            nota[i]=input.nextDouble();
        }
        PrintoMesataren(nota);

    }
}
