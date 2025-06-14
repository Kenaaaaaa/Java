package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that takes a positive number from the user (type int) and writes all
numbers from 1 to the given number, each on the next line, with the following changes:
● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
● in  place  of  numbers  divisible  by  7,  instead  of  a  number  the  program  should  write
"Buzz"
● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"*/


import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Lexo nr
        System.out.println("Jep nje nr pozitiv: ");
        int n=input.nextInt();

        //Kontrollojme input
        if(n<=0){
            System.out.println("Te lutem fut nje numer pozitiv");
            return;
        }

        //Loop nga 1 te n
        for (int i = 0; i < n; i++) {
            if(i%3==0 && i%7==0){
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            }
        }
    }

