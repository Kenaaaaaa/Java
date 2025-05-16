package Practise_Java_Fundamentals5;
/*Krijo një metodë që llogarit mesataren e të gjithë elementëve në një array
2D.
Metoda duhet të kthejë një vlerë double si mesatare e të gjithë elementëve*/
import java.util.Scanner;

public class Mesatarja2D {

    // Metoda që llogarit mesataren e elementëve në një array 2D
    public static double llogaritMesataren(int[][] matrice) {
        int shuma = 0;
        int numerElementesh = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                shuma += matrice[i][j];
                numerElementesh++;
            }
        }

        return (double) shuma / numerElementesh;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Marrim përmasat e matricës
        System.out.print("Jep numrin e rreshtave: ");
        int rreshta = scanner.nextInt();
        System.out.print("Jep numrin e kolonave: ");
        int kolona = scanner.nextInt();

        int[][] matrice = new int[rreshta][kolona];

        // Marrim vlerat nga përdoruesi
        System.out.println("Jep elementët e matricës:");
        for (int i = 0; i < rreshta; i++) {
            for (int j = 0; j < kolona; j++) {
                System.out.print("Elementi [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Llogaritja dhe afishimi i mesatares
        double mesatarja = llogaritMesataren(matrice);
        System.out.println("Mesatarja e elementëve në matricë është: " + mesatarja);

        scanner.close();
    }
}

