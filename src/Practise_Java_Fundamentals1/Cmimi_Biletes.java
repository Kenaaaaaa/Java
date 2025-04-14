package Practise_Java_Fundamentals1;

import java.util.Scanner;

public class Cmimi_Biletes {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Ju lutem, shkruani moshen tuaj");
        int mosha=input.nextInt();
        int cmimi_Femije=3;
        int cmimi_rritur=6,cmimi_pleq=0;
        if (mosha<=12){
            System.out.println("Ju do te paguani "+cmimi_Femije);
        } else if (mosha<=65) {
            System.out.println("Ju do te paguani "+cmimi_rritur);
        }
        else {
            System.out.println("Bileta juaj eshte falas. Enjoy!");
        }
    }
}
