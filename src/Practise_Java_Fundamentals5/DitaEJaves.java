package Practise_Java_Fundamentals5;
/*Krijo një metodë që kthen ditën e javës për një datë të dhënë.
Për shembull, për datën 25/12/2023 metoda duhet të kthejë “MONDAY”.
Gjej indeksin e parë të një elementi që përsëritet në një array.*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DitaEJaves {

    // Metoda që kthen ditën e javës për një datë të dhënë
    public static String gjejDitenEJaves(String dataTekst) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataTekst, formatter);
        return data.getDayOfWeek().toString(); // Kthen MONDAY, TUESDAY, etj.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jep një datë (dd/MM/yyyy): ");
        String dataInput = scanner.nextLine();

        try {
            String dita = gjejDitenEJaves(dataInput);
            System.out.println("Dita e javës është: " + dita);
        } catch (Exception e) {
            System.out.println("Format i pavlefshëm. Përdor formatin dd/MM/yyyy.");
        }

        scanner.close();
    }
}
