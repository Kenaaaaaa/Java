package Practise_Java_Fundamentals5;
/*Krijo një metodë që kontrollon nëse një array është i renditur në mënyrë
rritëse.
Kthe true nëse array është i renditur nga më i vogli tek më i madhi,
përndryshe false*/
import java.util.Scanner;

public class KontrollRenditje {

    // Metoda që kontrollon nëse array është në mënyrë rritëse
    public static boolean eshteRenditurRritje(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Marrim madhësinë e array-t
        System.out.print("Jep madhësinë e array-t: ");
        int madhesia = scanner.nextInt();

        int[] array = new int[madhesia];

        // Marrim vlerat nga përdoruesi
        System.out.println("Jep vlerat e array-t:");
        for (int i = 0; i < madhesia; i++) {
            System.out.print("Elementi [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Kontrollojmë renditjen
        boolean eshteRrites = eshteRenditurRritje(array);

        // Rezultati
        if (eshteRrites) {
            System.out.println("Array është i renditur në mënyrë rritëse.");
        } else {
            System.out.println("Array nuk është i renditur në mënyrë rritëse.");
        }

        scanner.close();
    }
}
