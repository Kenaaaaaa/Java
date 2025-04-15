package Practise_Java_Fundamentals3.Klasat.PorosiRestoranti;

import java.util.Scanner;

public class TestPorosiRestoranti {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Krijojme nje objekt bosh
        PorosiRestoranti porosi1=new PorosiRestoranti();


        //Marrim te dhenat nga perdoruesi
        System.out.println("Fut cmimin");
       porosi1.cmimi=input.nextDouble();

        System.out.println("Fut emrin e porosise");
        porosi1.emri=input.next();

        System.out.println("Fut sasine e porosise");
        porosi1.sasia=input.nextInt();

        System.out.println("Totali i Porosise = "+porosi1.TotalPorosi());
    }
}
