package Practise_Java_Fundamentals3.Array1D;

/*4.	Gjej vlerën më të vogël dhe më të madhe në array
Jepet një array int[] vlera = {12, 45, 3, 78, 9, 21}
 (lexo te dhenat nga useri).
  Gjej minimumin dhe maksimumin.
*/

import java.util.Scanner;

public class Min_Max_Array {

    //Metoda Max
    static int Max(int[]vlera){
        int max=vlera[0];
        for(int i=0;i<vlera.length;i++){
            if(vlera[i]>max){
                max=vlera[i];
            }
        }
        return max;
    }


    //Metoda Min
    static int Min(int[]vlera){
        int min=vlera[0];
        for(int i=0;i<vlera.length;i++){
            if(vlera[i]<min){
                min=vlera[i];
            }
        }
        return min;
    }


    //Main
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //sa vlera do fusi perdoruesi
        System.out.println("Sa vlera do fusni?");
        int nrVlerave=input.nextInt();

        //Deklaro dhe Inicializo Array
        int [] vlera=new int[nrVlerave];

        //Lexo vlerat nga perdoruesi
        System.out.println("Fusni vlerat per te cilat do gjejme min dhe max");
        for(int i=0;i<vlera.length;i++){
            vlera[i]=input.nextInt();
        }
        System.out.println("Max = "+Max(vlera));
        System.out.println("Min = "+Min(vlera));
    }
}
