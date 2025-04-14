package JavaFundamentals_Revision;
/*
* Shkruaj nje aplikacion qe merr nje numer pozitiv nga perdoruesi,tipin int,
*  printon te gjithe numrat prim me te medhenj se 1 dhe me te vogel se numri i dhene  */


import java.util.Scanner;
public class Ushtrimi5_PrimNr {

    // Metoda që afishon të gjithë numrat prim më të vegjël se nr
    static void isPrim(int nr) {
        if (nr <= 1) {
            System.out.println("Numri eshte invalid");
            return;
        }

        for (int i = 2; i < nr; i++) {
            boolean eshtePrim = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    eshtePrim = false;
                    break;
                }
            }

            if (eshtePrim) {
                System.out.println("Numri " + i + " eshte prim");
            }
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fut numrin qe do: ");
        int n = input.nextInt();
        isPrim(n);
    }
}

