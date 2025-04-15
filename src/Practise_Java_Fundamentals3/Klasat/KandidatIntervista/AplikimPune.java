package Practise_Java_Fundamentals3.Klasat.KandidatIntervista;

public class AplikimPune {

    //Deklarimi i Variablave
    private String emri;
    private int viteEksperience;
    private String edukimi;
    private boolean kaCertifikime;

    //Konstruktor Bosh
    public AplikimPune(){}

    //Konstruktor me Parametra
    public AplikimPune(String emri, int viteEksperience, String edukimi,boolean kaCertifikime){
        this.emri  =emri;
        this.viteEksperience=viteEksperience;
        this.edukimi=edukimi;
        this.kaCertifikime=kaCertifikime;
    }

    //SETTERS

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setViteEksperience(int viteEksperience) {
        this.viteEksperience = viteEksperience;
    }

    public void setEdukimi(String edukimi) {
        this.edukimi = edukimi;
    }

    public void setKaCertifikime(boolean kaCertifikime) {
        this.kaCertifikime = kaCertifikime;
    }


    //GETTERS

    public String getEmri() {
        return emri;
    }

    public int getViteEksperience() {
        return viteEksperience;
    }

    public String getEdukimi() {
        return edukimi;
    }

    public boolean isKaCertifikime() {
        return kaCertifikime;
    }

    //METODAT

    public boolean kualifikohetPerInterviste(int viteEksperience,String edukimi,boolean kaCertifikime){
        if (viteEksperience >= 2 && (edukimi.equals("Bachelor") || edukimi.equals("Master") || edukimi.equals("Doktoratë")) && kaCertifikime) {
           return true;
       }
       else{
           return false;
       }
    }
}
