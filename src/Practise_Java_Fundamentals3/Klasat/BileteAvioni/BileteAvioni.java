package Practise_Java_Fundamentals3.Klasat.BileteAvioni;

public class BileteAvioni {

    //Deklarimi i variablave
    private String destination;
    private double cmimiBaze;
    private boolean kaBagazh;

    //Konstruktori Bosh
    public BileteAvioni(){}

    //Konstruktori me Parametra
    public BileteAvioni(String destination,double cmimiBaze, boolean kaBagazh){
        this.destination=destination;
        this.cmimiBaze=cmimiBaze;
        this.kaBagazh=kaBagazh;
    }


    //Setters
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCmimiBaze(double cmimiBaze) {
        this.cmimiBaze = cmimiBaze;
    }

    public void setKaBagazh(boolean kaBagazh) {
        this.kaBagazh = kaBagazh;
    }

    //GETTERS
    public String getDestination() {
        return destination;
    }

    public double getCmimiBaze() {
        return cmimiBaze;
    }

    public boolean isKaBagazh() {
        return kaBagazh;
    }

    //METODAT

    //Metoda Cmimi Final
    public double cmimiFinal(boolean kaBagazh,double cmimiBaze){
       double cmimiTotal;
       if(kaBagazh){
           cmimiTotal=cmimiBaze+30.0;
        }
       else{
           cmimiTotal=cmimiBaze;
       }
       return cmimiTotal;
    }
}
