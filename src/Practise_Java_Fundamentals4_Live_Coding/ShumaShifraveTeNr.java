package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that gets one positive number (type int) from the user and calculates
a sum of digits of the given number. Hint: to make some operations on every single digit
of the number (digit by digit), you can calculate the remainder of dividing the number by
10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
digit).*/
import java.util.Scanner;

public class ShumaShifraveTeNr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lexo një numër pozitiv nga përdoruesi
        System.out.print("Shkruaj një numër pozitiv: ");
        int numri = input.nextInt();

        if (numri <= 0) {
            System.out.println("Ju lutem shkruani një numër pozitiv.");
            return;
        }

        int shuma = 0;
        int kopje = numri;

        // Përsërit derisa numri bëhet 0
        while (kopje > 0) {
            int cifraEFundit = kopje % 10; // merr cifrën e fundit
            shuma += cifraEFundit;         // shto te shuma
            kopje = kopje / 10;            // hiq cifrën e fundit
        }

        // Afisho rezultatin
        System.out.println("Shuma e shifrave të numrit " + numri + " është: " + shuma);
}
}

