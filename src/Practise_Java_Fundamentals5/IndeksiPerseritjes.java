package Practise_Java_Fundamentals5;
/*Shkruaj një metodë që kontrollon një array int[] dhe kthen indeksin ku
për herë të parë ndodh përsëritja e një elementi
*/
import java.util.Scanner;

public class IndeksiPerseritjes {

    // Metoda që kthen indeksin ku për herë të parë ndodh përsëritja
    public static int gjejIndeksinEPareTePerseritjes(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return i; // kthen indeksin e parë që ka përsëritje më vonë
                }
            }
        }
        return -1; // nëse nuk ka përsëritje
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Marrja e madhësisë së array-t
        System.out.print("Jep madhësinë e array-t: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Marrja e vlerave nga përdoruesi
        System.out.println("Jep vlerat e array-t:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementi [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Gjetja e indeksit të parë që përsëritet
        int indeks = gjejIndeksinEPareTePerseritjes(array);

        if (indeks != -1) {
            System.out.println("Elementi i parë që përsëritet është në indeksin: " + indeks);
        } else {
            System.out.println("Nuk ka asnjë përsëritje në array.");
        }

        scanner.close();
    }
}
