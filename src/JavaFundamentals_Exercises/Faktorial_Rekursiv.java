package JavaFundamentals_Exercises;

import java.util.Scanner;

public class Faktorial_Rekursiv {

    //Metoda Rekursive Faktorial
    static int Faktoriali(int nr){
        if((nr == 0 || nr==1))
            return 1;
        else
        return (nr * Faktoriali(nr-1));
    }


    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut nr qe do ");
        int nr=input.nextInt();
        System.out.println("Faktoriali = "+Faktoriali(nr));
    }
}
