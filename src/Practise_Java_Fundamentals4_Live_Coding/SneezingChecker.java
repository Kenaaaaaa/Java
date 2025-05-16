package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that reads a text from the user (type String) and checks whether the
user sneezed, i.e. whether the text equals ‘achooo!’ with one or more letter "o" at the end
of the expression (so both 'acho!' and 'achooooooo!’ are correct). Hint: use a regular
expression with the appropriate quantifier.*/

import java.util.Scanner;

public class SneezingChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lexo tekstin nga përdoruesi
        System.out.print("Shkruaj një tekst: ");
        String text = input.nextLine();

        // Kontrollo nëse përputhet me modelin e teshtimës: achoo!, achOOOO!, etc.
        if (text.matches("acho+!")) {
            System.out.println("Shëndet! Ti teshtive!");
        } else {
            System.out.println("Nuk është teshtimë.");
        }
    }
}
