package Practise_Java_Fundamentals5;
/*Shkruaj një metodë që kontrollon një array int[] dhe kthen indeksin ku
për herë të parë ndodh përsëritja e një elementi merr nga perdoruesi.Për çdo element në një array, llogarit sa elementë janë më të vegjël se ai.


*/
import java.util.Scanner;


public class IndeksiPerseritjes{

    //  Metoda që gjen indeksin ku për herë të parë ndodh përsëritja
    public static int gjejIndeksinEPareTePerseritjes(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return i;
                }
            }
        }
        return -1; // nëse nuk ka përsëritje
    }

    // ✅ Metoda që për çdo element, gjen sa janë më të vegjël se ai
    public static int[] llogaritMeTeVegjelSeSecili(int[] array) {
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

        // 📥 Marrja e array-t nga përdoruesi
        System.out.print("Jep madhësinë e array-t: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Jep vlerat e array-t:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementi [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // ✅ Pjesa 1: Gjetja e indeksit të parë të përsëritjes
        int indeksPerseritje = gjejIndeksinEPareTePerseritjes(array);
        if (indeksPerseritje != -1) {
            System.out.println("\nElementi i parë që përsëritet është në indeksin: " + indeksPerseritje);
        } else {
            System.out.println("\nNuk ka përsëritje në array.");
        }

        // ✅ Pjesa 2: Sa elementë janë më të vegjël se secili
        System.out.println("\nNumri i elementëve më të vegjël për secilin:");
        int[] meTeVegjel = llogaritMeTeVegjelSeSecili(array);
        for (int i = 0; i < n; i++) {
            System.out.println("Elementi " + array[i] + " ka " + meTeVegjel[i] + " më të vegjël se ai.");
        }

        scanner.close();
    }
}
