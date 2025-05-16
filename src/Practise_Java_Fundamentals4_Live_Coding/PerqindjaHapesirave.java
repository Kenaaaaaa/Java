package Practise_Java_Fundamentals4_Live_Coding;
import java.util.Scanner;
/*Write an application that reads a text from the user (type String) and counts a percentage
of occurrences of a space character.*/
public class PerqindjaHapesirave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lexo tekstin nga përdoruesi
        System.out.print("Shkruaj një tekst: ");
        String text = input.nextLine();

        int totalChars = text.length();
        int spaceCount = 0;

        // Numëro sa herë shfaqet karakteri ' '
        for (int i = 0; i < totalChars; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Kontroll nëse teksti është bosh
        if (totalChars == 0) {
            System.out.println("Teksti është bosh.");
        } else {
            double percentage = ((double) spaceCount / totalChars) * 100;
            System.out.printf("Përqindja e hapësirave është: %.2f%%\n", percentage);
        }
    }
}
