package Leksioni2;

import java.util.Scanner;

public class If_Adult {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Futni moshen tuaj");
        int mosha= input.nextInt();

        if(mosha>=18){
            System.out.println("Je adult");
        }
        else System.out.println("Je minoren");
    }
}
