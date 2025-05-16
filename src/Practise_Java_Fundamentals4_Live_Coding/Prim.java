package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that takes a positive number from the user (type int) and prints all
prime numbers greater than 1 and less than the given number.
*/

import java.util.Scanner;

public class Prim {

    //Metoda Prim
    static boolean isPrim(int n){
        boolean isPrimnr=true;
        if(n<2){
            isPrimnr=false;
        }

        for (int i = 0; i < n; i++) {
            if(n%i ==0){
                isPrimnr=false;
            }
        }
        isPrimnr=true;
        return  isPrimnr;
    }




    //Main
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Lexo nr
        System.out.println("Jep nr");
        int nr=input.nextInt();

        if(nr<=2){
            System.out.println("Nuk ka nr prim me te vegjel se 2");
            return;
        }
//printo nr Prim
        for (int i = 0; i < nr; i++) {
            if(isPrim(i)){
                System.out.println(i);
            }
        }

    }
}
