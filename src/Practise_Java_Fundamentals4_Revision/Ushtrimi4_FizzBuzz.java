package Practise_Java_Fundamentals4_Revision;

import java.util.Scanner;

public class Ushtrimi4_FizzBuzz {


    //Metoda qe ben Fizz Buzz
    static void FizzBuzz(int nr){

        int i;
        for(i=0;i<=nr;i++){
            //kontrollojme nese plotepjesetohet me 3 dhe 7

            if(i%3==0 && i%7==0){
                System.out.println("FizzBuzz");
            }

            //kontrollojme nese plotepjesetohet me 3
            else {
                //kontrollojme nese plotepjesetohet me 7

                if (i % 3 == 0) {
                    System.out.println("Fizz");

                } else {
                    if (i % 7 == 0) {
                        System.out.println("Buzz");

                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        System.out.println("Fut numrin deri ku te afishojme numrat dhe fizz Buzz");
        int a=input.nextInt();
        FizzBuzz(a);

    }

}
