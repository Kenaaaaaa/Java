package Practise_Java_Fundamentals5;
import java.util.Scanner;
/*Krijo një metodë që gjen shumën e të gjithë elementëve në një array 2D.
Metoda duhet të marrë si parametër një matricë dhe të kthejë shumën totale
të elementëve të saj.*/
public class Array2DSum{

    // Metoda që llogarit shumën e elementeve të një matrice 2D
    public static int gjejShumen(int[][] matrice) {
        int shuma = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                shuma += matrice[i][j];
            }
        }

        return shuma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leximi i përmasave të matricës
        System.out.print("Jep numrin e rreshtave: ");
        int rreshta = scanner.nextInt();
        System.out.print("Jep numrin e kolonave: ");
        int kolona = scanner.nextInt();

        // Krijimi i matricës dhe marrja e vlerave nga përdoruesi
        int[][] matrice = new int[rreshta][kolona];

        System.out.println("Jep elementët e matricës:");
        for (int i = 0; i < rreshta; i++) {
            for (int j = 0; j < kolona; j++) {
                System.out.print("Elementi [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Thirrja e metodës dhe shfaqja e rezultatit
        int shumaTotale = gjejShumen(matrice);
        System.out.println("Shuma e elementeve të matricës është: " + shumaTotale);

        scanner.close();
    }
}
