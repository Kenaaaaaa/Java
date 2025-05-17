package Practise_Java_Fundamentals6;
/*Shkruaj një metodë që merr një string dhe përdor regex për të verifikuar nëse është
një adresë email valide.*/

import java.util.Scanner;

public class ValidimEmaili {

    public static boolean eshteEmailValid(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jep një adresë emaili: ");
        String email = scanner.nextLine();

        if (eshteEmailValid(email)) {
            System.out.println("Emaili është i vlefshëm.");
        } else {
            System.out.println("Emaili nuk është i vlefshëm.");
        }

        scanner.close();
    }
}

