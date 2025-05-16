package Practise_Java_Fundamentals5;
/*Krijo një metodë që llogarit diferencën mes diagonales kryesore dhe asaj
sekondare në një matricë katrore.
Kthe vlerën absolute të diferencës së shumës së dy diagonaleve*/
import java.util.Scanner;

public class DiferencaDiagonaleve {

    // Metoda që llogarit vlerën absolute të diferencës mes diagonaleve
    public static int llogaritDiferencenDiagonaleve(int[][] matrice) {
        int shumaKryesore = 0;
        int shumaSekondare = 0;
        int n = matrice.length;

        for (int i = 0; i < n; i++) {
            shumaKryesore += matrice[i][i];                 // Diagonalja kryesore: [0][0], [1][1], ...
            shumaSekondare += matrice[i][n - 1 - i];         // Diagonalja sekondare: [0][n-1], [1][n-2], ...
        }

        return Math.abs(shumaKryesore - shumaSekondare);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leximi i madhësisë së matricës katrore
        System.out.print("Jep madhësinë e matricës katrore (n x n): ");
        int n = scanner.nextInt();

        int[][] matrice = new int[n][n];

        // Marrja e vlerave nga përdoruesi
        System.out.println("Jep vlerat e matricës:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elementi [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Llogaritja e diferencës mes diagonaleve
        int diferenca = llogaritDiferencenDiagonaleve(matrice);
        System.out.println("Diferenca absolute mes diagonales kryesore dhe sekondare është: " + diferenca);

        scanner.close();
    }
}
