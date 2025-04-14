package Practise_Java_Fundamentals1;
/*Kontrollimi nëse një numër është prim
- Shpjegimi: Programi lexon një numër dhe përdor një cikël while dhe një kusht if për të
kontrolluar nëse numri është prim (ka vetëm dy pjestues: 1 dhe vetveten).
- Shembull input: 7
- Shembull output: 7 është numër prim*/


import java.util.Scanner;

public class Nr_Prim {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruani një numër: ");
        int numri = scanner.nextInt();

        boolean eshtePrim = true;

        // Rastet speciale
        if (numri <= 1) {
            eshtePrim = false;
        }
        else if (numri == 2) {
            eshtePrim = true;
        }
        else if (numri % 2 == 0) {
            eshtePrim = false; // Numrat çift > 2 nuk janë prim
        }
        else {
            // Kontrollojmë vetëm pjestuesit tek deri në numrin/2
            int pjestuesi = 3;
            while (pjestuesi * pjestuesi <= numri) { // Ekivalent me pjestuesi <= sqrt(numri)
                if (numri % pjestuesi == 0) {
                    eshtePrim = false;
                    break;
                }
                pjestuesi += 2; // Kalojmë vetëm  numrat tek
            }
        }

        if (eshtePrim) {
            System.out.println(numri + " është numër prim");
        } else {
            System.out.println(numri + " nuk është numër prim");
        }

        scanner.close();
    }
}