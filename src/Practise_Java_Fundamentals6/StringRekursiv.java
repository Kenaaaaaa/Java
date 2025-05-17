package Practise_Java_Fundamentals6;

public class StringRekursiv {

    // Metoda që kthen përmbys një string duke përdorur rekursion
    public static String ktheStringunPerbys(String tekst) {
        if (tekst.isEmpty()) {
            return tekst; // baza e rekursionit
        }
        // merr shkronjën e fundit + pjesa tjetër përmbys
        return ktheStringunPerbys(tekst.substring(1)) + tekst.charAt(0);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Jep një tekst: ");
        String fjala = scanner.nextLine();

        String permbys = ktheStringunPerbys(fjala);
        System.out.println("Teksti përmbys: " + permbys);

        scanner.close();
    }
}
