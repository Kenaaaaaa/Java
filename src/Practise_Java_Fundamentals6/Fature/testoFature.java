package Practise_Java_Fundamentals6.Fature;

public class testoFature {
    public static void main(String[] args) {
        String[] produktet = {"Bukë", "Qumësht", "Vaj"};
        double[] cmimet = {1.2, 0.9, 3.5};
        int[] sasite = {2, 3, 1};

        Fature fatura = new Fature("Elira Duka", produktet, cmimet, sasite);
        fatura.afishoProduktet();
    }
}
