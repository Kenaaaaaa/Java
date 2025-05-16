package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that will read from the user the date of your next SDA classes and
calculate how many days are left to them.
Hint: read the date as String and parse it to LocalDate. Get the current date using
LocalDate.now() method.


*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysUntilSDAClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lexo datën si tekst nga përdoruesi
        System.out.print("Shkruaj datën e klasës tjetër SDA (në formatin yyyy-MM-dd): ");
        String dateText = input.nextLine();

        try {
            // Krijo formatter për datën
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Konverto tekstin në LocalDate
            LocalDate classDate = LocalDate.parse(dateText, formatter);

            // Merr datën e sotme
            LocalDate today = LocalDate.now();

            // Llogarit diferencën në ditë
            long daysBetween = ChronoUnit.DAYS.between(today, classDate);

            // Shfaq rezultatin
            if (daysBetween > 0) {
                System.out.println("Janë " + daysBetween + " ditë deri në klasën tjetër SDA.");
            } else if (daysBetween == 0) {
                System.out.println("Klasa është sot!");
            } else {
                System.out.println("Data e dhënë është në të kaluarën.");
            }
        } catch (Exception e) {
            System.out.println("Formati i datës nuk është i saktë. Përdor formatin yyyy-MM-dd.");
        }
    }
}

