package Practise_Java_Fundamentals4_Revision;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class DataExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Shkruaj datën e skadencës së dokumentit (formati dd-MM-yyyy): ");
        String expiryDateString = scanner.nextLine(); //01-05-2023


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate expiryDate = LocalDate.parse(expiryDateString, formatter);


        LocalDate currentDate = LocalDate.now();

        // Llogarit diferencën mes datës aktuale dhe datës së skadencës në muaj
        long monthsDifference = ChronoUnit.MONTHS.between(currentDate, expiryDate);


        // Kontrollojmë nëse dokumenti ka skaduar ose do të skadojë brenda 3 muajve
        if (monthsDifference <= 3) {
            System.out.println("Dokumenti ka skaduar ose është në prag të skadimit brenda 3 muajve.");
        } else {
            System.out.println("Dokumenti është ende i vlefshëm për udhëtim.");
        }

    }}
