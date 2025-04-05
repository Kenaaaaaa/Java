package Leksioni5;

/*//krijo nje program qe llogarit
// sa eshte % e adulteve ne nje apartament*/

import java.util.Scanner;

public class Perqindja_adult {
    public static void main(String[] args) {

        // Fut sa banore jane
        Scanner input= new Scanner(System.in);

        System.out.println("Sa banore jane ?");
        int nr_banoreve=input.nextInt();
        int i;
        int nr_adult=0;
        float perqindja;
        //Fut moshen per secilin prej tyre
        int[]mosha=new int[nr_banoreve];

        for(i=0;i<nr_banoreve;i++){
            System.out.println("Fut moshen per secilin banore");
            mosha[i]=input.nextInt();
            if(mosha[i]>=18){
                nr_adult++;

            }
        }
        perqindja=(float)nr_adult/nr_banoreve*100;
        System.out.println("Perqindja e adulteve ="+perqindja);
    }
}
