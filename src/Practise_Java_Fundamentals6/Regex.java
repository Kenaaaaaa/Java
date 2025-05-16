package Practise_Java_Fundamentals6;
/*Përdor regex për të validuar nëse një fjalë përmban vetëm shkronja të mëdha dhe ka të
paktën një numër*/
import java.util.Scanner;

public class Regex {

    public static boolean eshteValid(String fjala) {
        return fjala.matches("^(?=.*\\d)[A-Z\\d]+$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jep një fjalë për të kontrolluar: ");
        String input = scanner.nextLine();

        if (eshteValid(input)) {
            System.out.println("Fjala është e vlefshme: përmban vetëm shkronja të mëdha dhe të paktën një numër.");
        } else {
            System.out.println("Fjala NUK është e vlefshme.");
        }

        scanner.close();
    }
}
