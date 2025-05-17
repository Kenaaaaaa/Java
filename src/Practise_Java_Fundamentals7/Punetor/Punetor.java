package Practise_Java_Fundamentals7.Punetor;
/*Ushtrimi 1: Klasa Punetor dhe Pagesa
Krijo një klasë Punetor me të dhënat private: emri (String),
pagaOrar (float), orePune (int).
Krijo një klasë Pagesa që përmban një array të punëtorëve dhe një datë
të llogaritjes së pagës (LocalDate).
Shto një metodë që afishon emrin e punëtorit me pagën më të lartë
(llogaritur si pagaOrar * orePune).
Lexo të dhënat me Scanner dhe përdor LocalDate.parse për datë*/

public class Punetor {
    private String emri;
    private float pagaOrar;
    private int orePune;

    public Punetor(String emri, float pagaOrar, int orePune) {
        this.emri = emri;
        this.pagaOrar = pagaOrar;
        this.orePune = orePune;
    }

    public String getEmri() {
        return emri;
    }

    public float getPagaOrar() {
        return pagaOrar;
    }

    public int getOrePune() {
        return orePune;
    }

    public float llogaritPagen() {
        return pagaOrar * orePune;
    }
}
