package Practise_Java_Fundamentals5;
/*Numëro sa herë ndodh një numër i caktuar në një array.
Metoda merr si parametër një array dhe një numër, dhe kthen sa herë
ndodh ai numër në array*/
import java.util.Scanner;

public class NumriNeArray {

    // Metoda që numëron sa herë ndodh një numër në array
    public static int numeroSaHereNdodh(int[] array, int numriKerkuar) {
        int numerimi = 0;

        for (int element : array) {
            if (element == numriKerkuar) {
                numerimi++;
            }
        }

        return numerimi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leximi i madhësisë së array-t
        System.out.print("Jep madhësinë e array-t: ");
        int madhesia = scanner.nextInt();

        int[] array = new int[madhesia];

        // Marrja e vlerave nga përdoruesi
        System.out.println("Jep vlerat e array-t:");
        for (int i = 0; i < madhesia; i++) {
            System.out.print("Elementi [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Leximi i numrit që duam të kërkojmë
        System.out.print("Jep numrin që do të kërkosh: ");
        int numri = scanner.nextInt();

        // Thirrja e metodës dhe shfaqja e rezultatit
        int saHere = numeroSaHereNdodh(array, numri);
        System.out.println("Numri " + numri + " ndodhet " + saHere + " herë në array.");

        scanner.close();
    }
}
