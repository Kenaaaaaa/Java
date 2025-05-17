package Practise_Java_Fundamentals6.Fature;

public class Fature {
    private String emriKlientit;
    private String[] produktet;
    private double[] cmimet;
    private int[]sasia;

    //Konstruktori
    public Fature(String emriKlientit, String[]produktet, double[]cmimet,int[]sasia){
        this.emriKlientit=emriKlientit;
        this.produktet=produktet;
        this.cmimet=cmimet;
        this.sasia=sasia;
    }

    //GETTERS

    public double[] getCmimet() {
        return cmimet;
    }

    public int[] getSasia() {
        return sasia;
    }

    public String getEmriKlientit() {
        return emriKlientit;
    }

    public String[] getProduktet() {
        return produktet;
    }

    //SETTERS

    public void setCmimet(double[] cmimet) {
        this.cmimet = cmimet;
    }

    public void setEmriKlientit(String emriKlientit) {
        this.emriKlientit = emriKlientit;
    }

    public void setProduktet(String[] produktet) {
        this.produktet = produktet;
    }

    public void setSasia(int[] sasia) {
        this.sasia = sasia;
    }


    //METODA që llogarit totalin e faturës
    public double llogaritTotalin() {
        double total = 0;
        for (int i = 0; i < produktet.length; i++) {
            total += cmimet[i] * sasia[i];
        }
        return total;
    }

    // Metoda që afishon produktet
    public void afishoProduktet() {
        System.out.println("Fatura për klientin: " + emriKlientit);
        System.out.println("Produktet:");
        for (int i = 0; i < produktet.length; i++) {
            System.out.println("- " + produktet[i] + " | Sasia: " + sasia[i] + " | Çmimi për njësi: " + cmimet[i]);
        }
        System.out.println("Totali: " + llogaritTotalin() + " EUR");
    }
}


