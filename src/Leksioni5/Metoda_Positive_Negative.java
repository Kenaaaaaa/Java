package Leksioni5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Metoda_Positive_Negative {

    static void Mt_Positive_Negative (int a){
        if(a>0){
            System.out.println("Numri eshte pozitive");
        }
        else{
            System.out.println("Numri eshte negativ");
        }
    }



    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Fut numrin
        System.out.println("Fut numrin");
        int nr=input.nextInt();
        Mt_Positive_Negative(nr);
    }
}
