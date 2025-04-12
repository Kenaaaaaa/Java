package Leksioni6.KlasaBuilding;

public class Building {
    String tipologjia;
    float cmimiM2;
    float siperfaqe;
    int nrKateve;
    String adresa;
    int sconto;


    //Konstruktori bosh
   public Building(){}


    //Krijo konstruktoirn me parameter siperfaqe, cmimiM2, Tipologjia , sconto

    public Building( float siperfaqe, float cmimiM2, String tipologjia,int sconto){
       this.siperfaqe=siperfaqe;
       this.cmimiM2=cmimiM2;
       this.tipologjia=tipologjia;
       this.sconto=sconto;
    }

    //Krijo konstruktorin me parameter Adresa, tiplogjia, siperfaqe, sconto

    public Building(String adresa,String tipologjia,float siperfaqe,int  sconto){
       this.adresa=adresa;
       this.tipologjia=tipologjia;
       this.siperfaqe=siperfaqe;
       this.sconto=sconto;
    }

    //Krijo Metoden Afisho te dhenat

    public void Afisho(){
        System.out.println("Sipefaqja e prones eshte "+ siperfaqe);
        System.out.println("Tipologjia e prones eshte "+tipologjia);
        System.out.println("Cmimi i prones eshte "+cmimiM2);
        System.out.println("Numri i kateve eshte "+ nrKateve);
        System.out.println(" Adresa eshte "+adresa);
        System.out.println("Skonto eshte "+sconto);
    }

    public float LlogaritCmimin(float cmimiM2,float siperfaqe, int sconto ){
       float resultati = 0;
       if(sconto<0){
           System.out.println("Sconto eshte negative ");
       }
       else{
           resultati= (cmimiM2*siperfaqe)- ((float)sconto/100*(cmimiM2*siperfaqe));

       }

       return resultati;
    }

}
