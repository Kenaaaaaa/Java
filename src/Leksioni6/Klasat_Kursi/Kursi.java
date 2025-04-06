package Leksioni6.Klasat_Kursi;

public class Kursi {

    //Deklarimi i Variablave
    public String titulli;
    public float nrOresh;
    public String TrainerID;
    public int nrMuaj;


    //Java thote a ka nje metode me te njejtin emer me klasen Person, ne kete rast Java ta krijon vete bydefault, mta ben lidhjen
    public Kursi(){}


    public Kursi(String titulliLenda, int Muaj, float oret, String Idtrainer){
        titulli=titulliLenda;
        nrOresh=oret;
        TrainerID=Idtrainer;
        nrMuaj=Muaj;
    }


    //Metoda Afisho te dhenat
    public void Afisho(){
        System.out.println("Titulli = "+titulli);
        System.out.println("NrOreve = "+nrOresh);
        System.out.println("Trainer ID = "+TrainerID  );
        System.out.println("Numri I muajve = "+nrMuaj);
    }
    //Metoda checkMoreThan1Year
    public boolean checkMoreThan1Year(){
        if(nrMuaj>12){
            return true;
        }
        else{
            return false;
        }
    }

}
