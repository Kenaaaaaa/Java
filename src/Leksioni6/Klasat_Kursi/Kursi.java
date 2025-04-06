package Leksioni6.Klasat_Kursi;

public class Kursi {

    //Deklarimi i Variablave
    public String titulli;
    public float nrOresh;
    public String TrainerID;
    public int nrMuaj;

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
