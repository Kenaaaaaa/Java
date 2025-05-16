package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that will take a positive number from the user (type int) and draw a
wave with a given length and height of 4 lines, according to the following example (fill
empty spaces with spaces):*/

import java.util.Scanner;

public class Wave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Shkruaj gjatësinë e valës (numër pozitiv): ");
        int n = input.nextInt(); // numri i valëve

        int lartesia = 4;
        int gjatesiaVales = n * 6; // çdo valë ka 6 ylla

        for (int rresht = 0; rresht < lartesia; rresht++) {
            for (int kolone = 0; kolone < gjatesiaVales; kolone++) {
                int mod = kolone % 6;

                if ((rresht == 0 && mod == 0) ||
                        (rresht == 1 && (mod == 1 || mod == 5)) ||
                        (rresht == 2 && (mod == 2 || mod == 4)) ||
                        (rresht == 3 && mod == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // kalim në rresht tjetër
        }
    }
}