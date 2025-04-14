package Practise_Java_Fundamentals4_Revision;

import java.util.Scanner;

/*Shkruaj nje app, qe merr nr  nga perdoruesi(tipi int)
*dhe llogarit shumen e numrit harmonik nga 1 tek n */
public class Ushtrimi6_Harmonika {

    //Metoda Harmonike

    static double Shuma(int nr){
        double sh=0;
        int i;
        for(i=1;i<=nr;i++){
            sh+=1d/i;
        }
        return sh;
    }




    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut nr qe do ");
        int nr=input.nextInt();
        System.out.println("Shuma harmonike është: " + Shuma(nr));
    }
}
