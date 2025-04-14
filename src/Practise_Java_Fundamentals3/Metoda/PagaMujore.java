package Practise_Java_Fundamentals3.Metoda;
/*Krijo nje metode qe merr pagen ditore dhe numrin e diteve te punuara dhe kthen pagen mujore . Nese ditet e punes jane me shume se 22,
* shto bonuse prej 10 %*/

import java.util.Scanner;

public class PagaMujore {

    //Metoda Paga Mujore

    static double Paga_Mujore(double pagaDitore, int nrDiteve){
        double pgMujore;

        if (nrDiteve<=22){
            pgMujore=pagaDitore*nrDiteve;
        }
        else{
            pgMujore=pagaDitore*nrDiteve+(pagaDitore*nrDiteve*0.1);
        }
        return pgMujore;
    }



    //Main
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double pgDitore;
        int nrDiteve;

        //Merr pagen Ditore nga perdoruesi
        System.out.println("Fut pagen ditore ");
        pgDitore=input.nextDouble();

        //Merr numrin e Diteve nga perdoruesi
        System.out.println("Fut numrin e diteve te punes nga perdoruesi");
        nrDiteve=input.nextInt();

        //Afisho pagen mujore
        System.out.println("Paga Mujore = "+Paga_Mujore(pgDitore,nrDiteve));
    }
}
