package Practise_Java_Fundamentals7.Klient;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Sa klientë do të shtoni? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // pastron newline

        klient[] klientet = new klient[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nKlienti #" + (i + 1));
            System.out.print("Emri: ");
            String emri = scanner.nextLine();
            System.out.print("Mbiemri: ");
            String mbiemri = scanner.nextLine();
            System.out.print("Mosha: ");
            int mosha = scanner.nextInt();
            scanner.nextLine(); // pastron newline

            klientet[i] = new klient(emri, mbiemri, mosha);
        }

        System.out.print("\nJep vendndodhjen e udhëtimit: ");
        String vendndodhja = scanner.nextLine();

        System.out.print("Jep datën e nisjes (yyyy-MM-dd): ");
        String dataStr = scanner.nextLine();
        LocalDate dataNisjes = LocalDate.parse(dataStr, formatter);

        RezervimUdhetimi rezervimi = new RezervimUdhetimi(klientet, dataNisjes, vendndodhja);

        System.out.println("\n Detaje për rezervimin:");
        System.out.println(" Destinacioni: " + vendndodhja);
        rezervimi.afishoDitetDeriNeNisje();
        rezervimi.afishoKlientinMeTeRi();

        scanner.close();
    }
}

