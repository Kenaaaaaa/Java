package Practise_Java_Fundamentals5;
/* Krijo një metodë që për një array int[] kthen një array të ri, ku çdo
vlerë përfaqëson numrin e elementëve më të vegjël se ai element në
arrayn origjina*/
import java.util.Scanner;

public class MeTeVegjelArray {

    // Metoda që kthen një array të ri ku çdo vlerë është numri i elementëve më të vegjël se ai
    public static int[] ktheNumrinEMeteVegjelve(int[] array) {
        int n = array.length;
        int[] rezultat = new int[n];

        for (int i = 0; i < n; i++) {
            int numerim = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] < array[i]) {
                    numerim++;
                }
            }
            rezultat[i] = numerim;
        }

        return rezultat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leximi i madhësisë së array-t
        System.out.print("Jep madhësinë e array-t: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Leximi i vlerave të array-t
        System.out.println("Jep elementët e array-t:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementi [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Thirrja e metodës dhe shfaqja e array-t të ri
        int[] rezultati = ktheNumrinEMeteVegjelve(array);

        System.out.println("\nArray me numrin e elementëve më të vegjël:");
        for (int i = 0; i < n; i++) {
            System.out.println("Elementi " + array[i] + " → " + rezultati[i] + " më të vegjël");
        }

        scanner.close();
    }
}
