package Practise_Java_Fundamentals4_Live_Coding;
/*Write a program for solving a quadratic equation. The program should take three integers
(coefficients of the quadratic equation a, b, c) and calculate the roots    of  the
equation
 If delta ∆ comes out negative, print "Delta negative" and exit the program.
Formulas you’ll need:*/

import java.util.Scanner;

public class EkuacioniGradesDyte {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Lexo koeficentet a
        System.out.println("Jep koeficentin a:");
        int a= input.nextInt();

        //Lexo koeficentet  b
        System.out.println("Jep koeficentin b:");
        int b= input.nextInt();

        //Lexo koeficentet  c
        System.out.println("Jep koeficentin c:");
        int c= input.nextInt();

        //Llogarit dallori
        int dallori=b+b-4*a*c;

        //Nese dallori eshte negative
        if(dallori<0){
            System.out.println("Dallori negative ");
            System.exit(0);
        }

        //LLogarisim rrenjet
        double rrenjaDallorit=Math.sqrt(dallori);
        double x1=(-b + rrenjaDallorit) / (2*a);
        double x2=(-b - rrenjaDallorit) / (2*a);


        //Printo rrenjet
        System.out.println("Rrenja x1 = "+x1);
        System.out.println("Rrenja x2 = "+x2);

    }
}
