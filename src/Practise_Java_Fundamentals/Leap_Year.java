package Practise_Java_Fundamentals;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Fut nje numer");

        int viti=input.nextInt();

        if((viti%4==0 && viti!=100) || viti%400==0){
            System.out.println("VIti "+viti+" eshte i brishte");
        }
        else{
            System.out.println("VIti "+viti+" nuk eshte i brishte");
        }
    }
}
