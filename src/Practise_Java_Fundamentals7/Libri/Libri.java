package Practise_Java_Fundamentals7.Libri;
/*Ushtrimi 2: Klasa Libri dhe Porosi
Krijo klasën Libri me të dhëna: titulli (String), autori (String),
cmimi (float).
Krijo klasën Porosi me një listë librash (Libri[]) dhe një datë porosie.
Krijo një metodë që llogarit dhe afishon vlerën totale të porosisë dhe
titullin e librit më të shtrenjtë.
Leximi i të dhënave bëhet me Scanner, data me LocalDate.parse*/
public class Libri {
    private String titulli;
    private String autori;
    private float cmimi;

    public Libri(String titulli, String autori, float cmimi) {
        this.titulli = titulli;
        this.autori = autori;
        this.cmimi = cmimi;
    }

    public String getTitulli() {
        return titulli;
    }

    public String getAutori() {
        return autori;
    }

    public float getCmimi() {
        return cmimi;
    }
}
