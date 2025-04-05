package Practise_Java_Fundamentals2;
/*6.	Shkruani një program që lexon numra
nga përdoruesi derisa ai të fusë numrin 0. Programi duhet të përdorë një cikël
 Do While për të numëruar sa numra negativë dhe sa pozitivë janë futur.*/


import java.util.Scanner;

public class Numero_nr_perdoruesit {
    public static void main(String[] args) {

        int nr_positive=0;
        int nr_negative=0;
        int nr;

            do{
                Scanner input=new Scanner(System.in);
                System.out.println("Fut nje numer. Programi ndalon kur futni 0");
                nr=input.nextInt();
                if(nr>0){
                    nr_positive++;
                }
                else if (nr<0){
                    nr_negative++;
                }
            }        while(nr!=0);

        System.out.println("Perdoruesi ka futur "+ nr_positive+ " numra positive dhe "+nr_negative+" numra negative ");


    }
    }
