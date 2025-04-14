package Practise_Java_Fundamentals4_Revision;
import java.util.Scanner;

/*metode me parameter nje matrice dhe nje numer te plote
dhe kthen sa here ndodhet ky numer te matrica
*/
public class numriNeMatrice {
    static int saHereNumri (int[][] array, int numer) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numer) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jep rreshtat e matrices: ");
        int row = scan.nextInt();
        System.out.println("Jep kollonat e matrices: ");
        int col = scan.nextInt();
        if(row < 1 || col < 1) {
            System.out.println("Vlera te pavlefshme!");
        } else {
            System.out.println("Jep nje numer te plote: ");
            int numer = scan.nextInt();
            int[][] matrica = new int[row][col];

            //Inicializojme matricen nga useri
            for (int i = 0; i < matrica.length; i++) {
                for (int j = 0; j < matrica[i].length; j++) {
                    System.out.println("Jep nje numer: ");
                    matrica[i][j] = scan.nextInt();
                }
            }

            //Afishim matrice
            for (int i = 0; i < matrica.length; i++) {
                for (int j = 0; j < matrica[i].length; j++) {
                    System.out.print(matrica[i][j] + "\t");
                }
                System.out.println();
            }
            //sa here ndodhet numri
            System.out.println("Numri " + numer + " ndodhet " + saHereNumri(matrica, numer) + " here ne matrice.");
        }

    }
}
