package Practise_Java_Fundamentals4_Live_Coding;
import java.util.Scanner;

/*Write an application that will read texts (variables of the String type) until the user gives
the text "Enough!" and then writes the longest of the given texts (not including the text
"Enough!"). If the user does not provide any text, write "No text provided".*/
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


