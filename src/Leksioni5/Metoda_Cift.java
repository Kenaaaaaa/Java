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
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut vleren ");
        int nr=input.nextInt();
        Cift_tek(nr);

    }
}
