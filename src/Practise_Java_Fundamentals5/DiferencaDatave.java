package Practise_Java_Fundamentals5;
/*Llogarit numrin e ditëve midis dy datave të dhëna.
Metoda merr dy data dhe kthen numrin e ditëve që i ndajnë ato.*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiferencaDatave {

    // Metoda që kthen numrin e ditëve midis dy datave
    public static long ditetMesDatave(LocalDate data1, LocalDate data2) {
        return Math.abs(ChronoUnit.DAYS.between(data1, data2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Marrja e datës së parë
            System.out.print("Jep datën e parë (format: dd-MM-yyyy): ");
            String input1 = scanner.nextLine();
            LocalDate data1 = LocalDate.parse(input1, formatter);

            // Marrja e datës së dytë
            System.out.print("Jep datën e dytë (format: dd-MM-yyyy): ");
            String input2 = scanner.nextLine();
            LocalDate data2 = LocalDate.parse(input2, formatter);

            // Llogaritja e diferencës
            long ditet = ditetMesDatave(data1, data2);
            System.out.println("Numri i ditëve midis datave është: " + ditet);

        } catch (Exception e) {
            System.out.println("Gabim në formatin e datës. Përdor formatin dd-MM-yyyy.");
        }

        scanner.close();
    }
}

