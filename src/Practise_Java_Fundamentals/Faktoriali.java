package Practise_Java_Fundamentals;

import java.util.Scanner;

public class Faktoriali {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Fut nje numer qe do");
        int nr=input.nextInt();
        int faktoriali=1;
        int i;

        for(i=1;i<=nr;i++){
            faktoriali=i*faktoriali;
        }
        System.out.println("Faktoriali = "+faktoriali);
    }
}
