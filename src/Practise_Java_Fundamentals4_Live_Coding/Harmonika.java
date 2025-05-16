package Practise_Java_Fundamentals4_Live_Coding;

import java.util.Scanner;

/*Write an application that takes a number n from the user (type int) and calculates the
sum of the harmonic series from 1 to n*/
public class Harmonika {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int nr=input.nextInt();

        //kontrollo input
        if(nr<=0){
            System.out.println("Jep nr pozitiv: ");
            return;
        }

        //Llogarit shumen harmonike
        double sh=0.0;
        for (int i = 0; i < nr; i++) {
            sh+=1.0/i;
        }

        System.out.println("Sh = "+sh);
;    }
}
