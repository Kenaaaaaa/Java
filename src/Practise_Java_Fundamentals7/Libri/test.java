package Practise_Java_Fundamentals7.Libri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Sa libra do të porosisni? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // pastron newline

        Libri[] librat = new Libri[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nLibri #" + (i + 1));
            System.out.print("Titulli: ");
            String titulli = scanner.nextLine();

            System.out.print("Autori: ");
            String autori = scanner.nextLine();

            System.out.print("Çmimi: ");
            float cmimi = scanner.nextFloat();
            scanner.nextLine(); // pastron newline

            librat[i] = new Libri(titulli, autori, cmimi);
        }

        System.out.print("\nJep datën e porosisë (yyyy-MM-dd): ");
        String dataStr = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataStr, formatter);

        Porosi porosi = new Porosi(librat, data);
        porosi.afishoTotaliDheMeTeShtrenjtin();

        scanner.close();
    }
}
