package Leksioni5;

import java.util.Scanner;

public class Metoda_Cift {

    static void Cift_tek(int a){
        if (a%2==0){
            System.out.println("Numri eshte cift");
        }
        else{
            System.out.println("Numri eshte tek");
        }
    }

    static int Cift_tek2(int a){
        if(a%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut vleren ");
        int nr=input.nextInt();
        Cift_tek(nr);
        System.out.println( Cift_tek2(nr));


        if(Cift_tek2(nr)==0){
            System.out.println(nr*nr);
        }
    }
}
