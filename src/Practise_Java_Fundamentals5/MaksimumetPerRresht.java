package Practise_Java_Fundamentals5;
/*Gjej numrin maksimal në çdo rresht të një matrice 2D dhe ktheji në një
array të veçantë.
Çdo element në arrayn e ri përfaqëson maksimumin e një rreshti në matricë.
*/
import java.util.Scanner;

public class MaksimumetPerRresht {

    // Metoda që kthen një array me maksimumin e çdo rreshti
    public static int[] maksimumetNeRreshta(int[][] matrice) {
        int[] maksimumet = new int[matrice.length];

        for (int i = 0; i < matrice.length; i++) {
            int max = matrice[i][0]; // marrim fillimisht elementin e parë në rresht
            for (int j = 1; j < matrice[i].length; j++) {
                if (matrice[i][j] > max) {
                    max = matrice[i][j];
                }
            }
            maksimumet[i] = max;
        }

        return maksimumet;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Marrim përmasat e matricës
        System.out.print("Jep numrin e rreshtave: ");
        int rreshta = scanner.nextInt();
        System.out.print("Jep numrin e kolonave: ");
        int kolona = scanner.nextInt();

        int[][] matrice = new int[rreshta][kolona];

        // Marrim vlerat e matricës nga përdoruesi
        System.out.println("Jep vlerat e matricës:");
        for (int i = 0; i < rreshta; i++) {
            for (int j = 0; j < kolona; j++) {
                System.out.print("Elementi [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Marrim maksimumet për çdo rresht
        int[] maksimumet = maksimumetNeRreshta(matrice);

        // Shfaqim array-n me maksimumet
        System.out.println("\nMaksimumet në çdo rresht:");
        for (int i = 0; i < maksimumet.length; i++) {
            System.out.println("Rreshti " + i + ": " + maksimumet[i]);
        }

        scanner.close();
    }
}

