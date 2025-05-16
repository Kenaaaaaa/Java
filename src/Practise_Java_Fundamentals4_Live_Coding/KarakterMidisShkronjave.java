package Practise_Java_Fundamentals4_Live_Coding;
import java.util.Scanner;
/*Write an application that reads two lowercase letters of the Latin alphabet (type char)
and calculates how many characters is there in the alphabet between given letters.
Hint - use the ASCII code table and treat the characters as int numbers.*/
public class KarakterMidisShkronjave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lexo dy shkronja të vogla
        System.out.print("Shkruaj shkronjën e parë (a-z): ");
        char ch1 = input.next().charAt(0);

        System.out.print("Shkruaj shkronjën e dytë (a-z): ");
        char ch2 = input.next().charAt(0);

        // Konverto në kode ASCII
        int ascii1 = (int) ch1;
        int ascii2 = (int) ch2;

        // Llogarit diferencën absolute, përjashto vetë shkronjat
        int count = Math.abs(ascii1 - ascii2) - 1;

        if (count < 0) {
            System.out.println("Shkronjat janë të njëjta. Nuk ka karaktere në mes.");
        } else {
            System.out.println("Numri i shkronjave ndërmjet është: " + count);
        }
    }
}
