package Practise_Java_Fundamentals7.Klient;
/*Ushtrimi 3: Klasa Klient dhe RezervimUdhetimi
Krijo klasën `Klient` me emër, mbiemër, moshe (int).
Krijo klasën `RezervimUdhetimi` që përmban një array klientësh, datën e
nisjes dhe vendndodhjen.
Krijo një metodë që afishon numrin e ditëve që kanë mbetur deri në nisje.
Afisho klientin më të ri në moshë. Marrja e datës bëhet nga input dhe
konvertohet me `LocalDate.parse`*/


public class klient {
    private String emri;
    private String mbiemri;
    private int mosha;

    public Klient(String emri, String mbiemri, int mosha) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public String toString() {
        return emri + " " + mbiemri + " (" + mosha + " vjeç)";
    }
}

