package Practise_Java_Fundamentals6;

import java.util.Scanner;

public class NumriPareMeIMadh {

    public static Integer gjejNumrinEMadhPare(int[] array, int vlera) {
        for (int num : array) {
            if (num > vlera) {
                return num;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leximi i madhësisë së array-t
        System.out.print("Jep madhësinë e array-t: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Jep vlerat e array-t:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementi [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Leximi i vlerës për krahasim
        System.out.print("Jep vlerën për krahasim: ");
        int vlera = scanner.nextInt();

        Integer rezultati = gjejNumrinEMadhPare(array, vlera);
        if (rezultati != null) {
            System.out.println("Numri i parë më i madh se " + vlera + " është: " + rezultati);
        } else {
            System.out.println("Asnjë numër më i madh se " + vlera + " nuk u gjet.");
        }

        scanner.close();
    }
}
