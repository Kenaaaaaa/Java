package Practise_Java_Fundamentals6;
/*Shkruaj një metodë që për një array 1D me numra të plotë kthen një array të ri ku çdo
element është prodhimi i të gjithë elementëve përveç atij në pozicionin aktual*/
import java.util.Scanner;

public class ProdhimiPerPozicion {

    // Metoda që kthen një array ku çdo element është prodhimi i të tjerëve përveç vetes
    public static int[] prodhimiPerSecilin(int[] array) {
        int n = array.length;
        int[] rezultat = new int[n];

        // Llogarit prodhimin total
        int prodhimTotal = 1;
        int zeroCount = 0;

        for (int value : array) {
            if (value == 0) {
                zeroCount++;
            } else {
                prodhimTotal *= value;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                rezultat[i] = 0;
            } else if (zeroCount == 1) {
                rezultat[i] = (array[i] == 0) ? prodhimTotal : 0;
            } else {
                rezultat[i] = prodhimTotal / array[i];
            }
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

        // Thirrja e metodës dhe shfaqja e rezultatit
        int[] rezultati = prodhimiPerSecilin(array);

        System.out.println("\nArray i ri me prodhimin për secilin (përveç vetes):");
        for (int i = 0; i < n; i++) {
            System.out.println("Pozicioni " + i + ": " + rezultati[i]);
        }

        scanner.close();
    }
}

