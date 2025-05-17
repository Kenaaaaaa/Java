package Practise_Java_Fundamentals6;
/*Përdor rekursion për të llogaritur fuqinë e një numri a^b, ku a dhe b janë numra të
plotë*/


public class FuqiaRekursive {

    // Metoda rekursive për a^b
    public static int fuqi(int a, int b) {
        if (b == 0) {
            return 1; // çdo numër në fuqinë 0 është 1
        } else {
            return a * fuqi(a, b - 1);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Jep numrin bazë (a): ");
        int a = scanner.nextInt();

        System.out.print("Jep eksponentin (b ≥ 0): ");
        int b = scanner.nextInt();

        if (b < 0) {
            System.out.println("Eksponenti duhet të jetë jo negativ.");
        } else {
            int rezultati = fuqi(a, b);
            System.out.println(a + "^" + b + " = " + rezultati);
        }

        scanner.close();
    }
}
