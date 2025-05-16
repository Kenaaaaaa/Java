package Practise_Java_Fundamentals6;
/*Shkruaj një metodë që kthen diagonalen sekondare të një matrice katrore 2D.*/
import java.util.Scanner;

public class DiagonaleSekondare {

    // Metoda që kthen diagonalen sekondare të një matrice katrore
    public static int[] gjejDiagonalenSekondare(int[][] matrice) {
        int n = matrice.length;
        int[] diagonale = new int[n];

        for (int i = 0; i < n; i++) {
            diagonale[i] = matrice[i][n - 1 - i];
        }

        return diagonale;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leximi i madhësisë së matricës katrore
        System.out.print("Jep madhësinë e matricës (n x n): ");
        int n = scanner.nextInt();
        int[][] matrice = new int[n][n];

        // Marrja e vlerave të matricës nga përdoruesi
        System.out.println("Jep elementët e matricës:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elementi [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Thirrja e metodës
        int[] diagonale = gjejDiagonalenSekondare(matrice);

        // Shfaqja e diagonales sekondare
        System.out.println("\nDiagonala sekondare është:");
        for (int vlera : diagonale) {
            System.out.print(vlera + " ");
        }

        scanner.close();
    }
}
