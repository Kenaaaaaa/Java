package Practise_Java_Fundamentals1;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //Lexo nr nga perdoruesi
        System.out.println("Fut nje numer");
        int nr= input.nextInt();
        int a=0;
        int b=1;
        int sh=0;
        int count=3;
        if(nr>=1){
            System.out.println(a);
        }
        if(nr>=2){
            System.out.println(b);
        }
        while(count<=nr){
            sh=a+b;
            a=b;
            b=sh;
            count++;
            System.out.println(sh);
        }}
}
