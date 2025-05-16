package Practise_Java_Fundamentals4_Live_Coding;
import java.util.Scanner;

public class FjalaDyshe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lexo tekstin nga përdoruesi
        System.out.print("Shkruaj një tekst: ");
        String text = input.nextLine();

        // Ndaj tekstin në fjalë
        String[] words = text.split("\\s+"); // \\s+ për çdo numër hapësirash

        // Printo çdo fjalë dy herë
        for (String word : words) {
            System.out.print(word + " " + word + " ");
        }

        System.out.println(); // kalim në rreshtin tjetër
    }
}
