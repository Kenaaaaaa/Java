package Practise_Java_Fundamentals7.Sherbim;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Sa shërbime dëshiron të regjistrosh? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // pastron newline

        Sherbim[] sherbimet = new Sherbim[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nShërbimi #" + (i + 1));
            System.out.print("Emri i shërbimit: ");
            String emer = scanner.nextLine();

            System.out.print("Kategoria: ");
            String kategori = scanner.nextLine();

            System.out.print("Çmimi: ");
            double cmim = scanner.nextDouble();
            scanner.nextLine();

            sherbimet[i] = new Sherbim(emer, kategori, cmim);
        }

        System.out.print("\nJep datën e shërbimit (yyyy-MM-dd): ");
        String dataStr = scanner.nextLine();
        LocalDate dataSherbimit = LocalDate.parse(dataStr, formatter);

        FatureSherbimi fatura = new FatureSherbimi(sherbimet, dataSherbimit);
        fatura.afishoSherbimetDheMeTeShtrenjtin();

        scanner.close();
    }
}
