package Practise_Java_Fundamentals3.Klasat.PorosiRestoranti;

/*Krijo klasën që përfaqëson një porosi restoranti me:
Emri i produktit (String)
Sasia (int)
Çmimi për copë (double)
Metoda që kthen totalin e porosisë.
*/

public class PorosiRestoranti {

    //Deklarimi i Variablave

    String emri;
    int sasia;
    double cmimi;



    //Konstruktori (Metode , qe ti japim te dhenave vlere menjehre, kur krijojme nje objekt klase
    public PorosiRestoranti(){}


    //Metoda kthen Totalin e Porosise

    public double TotalPorosi(){

        return    cmimi*sasia;

    }
}
