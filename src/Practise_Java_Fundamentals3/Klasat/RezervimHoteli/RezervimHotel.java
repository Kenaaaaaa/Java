package Practise_Java_Fundamentals3.Klasat.RezervimHoteli;

/*•	RezervimHotel
Ndërto një klasë që përfaqëson një rezervim hoteli me këto të dhëna:
Emri i klientit (String)
Numri i netëve të qëndrimit (int)
Çmimi për natë (double)
Shto një metodë që llogarit totalin që klienti duhet të paguajë.
*/

public class RezervimHotel {

    //Deklarimii i Variablave
    String emri;
    int netet;
    double cmimi;

    //Konstruktoret
    public RezervimHotel(){}


    //Konstruktor me Parametra
    public RezervimHotel(String emri,int netet, double cmimi){
        this.emri=emri;
        this.netet=netet;
        this.cmimi=cmimi;
    }



    //Metodat

    public double totalCmimi(int netet, double cmimi){
        return netet*cmimi;
    }

}
