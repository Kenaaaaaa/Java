package Practise_Java_Fundamentals6;
/*Krijo një metodë që merr input një matrice dhe kthen transpozitën e një matrice 2D.*/


import java.util.Scanner;

public class TranspozitaMatrice {

    // Metoda që kthen transpozitën e një matrice 2D
    public static int[][] gjejTranspoziten(int[][] matrice) {
        int rreshta = matrice.length;
        int kolona = matrice[0].length;
        int[][] transpozita = new int[kolona][rreshta];

        for (int i = 0; i < rreshta; i++) {
            for (int j = 0; j < kolona; j++) {
                transpozita[j][i] = matrice[i][j];
            }
        }

        return transpozita;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Marr përmasat e matricës nga përdoruesi
        System.out.print("Jep numrin e rreshtave: ");
        int rreshta = scanner.nextInt();

        System.out.print("Jep numrin e kolonave: ");
        int kolona = scanner.nextInt();

        int[][] matrice = new int[rreshta][kolona];

        // Marr vlerat e matricës nga përdoruesi
        System.out.println("Jep elementët e matricës:");
        for (int i = 0; i < rreshta; i++) {
            for (int j = 0; j < kolona; j++) {
                System.out.print("Elementi [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Gjej transpozitën
        int[][] transpozita = gjejTranspoziten(matrice);

        // Shfaq transpozitën
        System.out.println("\nTranspozita e matricës:");
        for (int i = 0; i < transpozita.length; i++) {
            for (int j = 0; j < transpozita[i].length; j++) {
                System.out.print(transpozita[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

