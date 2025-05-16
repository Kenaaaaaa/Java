package Practise_Java_Fundamentals4_Live_Coding;
import java.util.Scanner;


public class TekstiMeIGjate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tekstiMeIGjate = "";
        boolean uShtuaTekst = false;

        System.out.println("Shkruaj tekstet një nga një. Shkruaj \"Enough!\" për të përfunduar.");

        while (true) {
            String rreshti = input.nextLine();

            if (rreshti.equals("Enough!")) {
                break;
            }

            uShtuaTekst = true;

            if (rreshti.length() > tekstiMeIGjate.length()) {
                tekstiMeIGjate = rreshti;
            }
        }

        if (!uShtuaTekst) {
            System.out.println("Nuk eshte shkruar text");
        } else {
            System.out.println("Teksti më i gjatë është: " + tekstiMeIGjate);
        }
    }
}


