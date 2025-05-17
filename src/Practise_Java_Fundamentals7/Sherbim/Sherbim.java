package Practise_Java_Fundamentals7.Sherbim;
/*Ushtrimi 4: Klasa Shërbim dhe FatureSherbimi
Krijo klasën Sherbim me emër shërbimi, kategori dhe çmim.
Krijo klasën FatureSherbimi me një array të shërbimeve të kryera dhe
datën e shërbimit.
Krijo metodë që afishon të gjitha shërbimet dhe shërbimin me çmimin më
të lartë.
Lexo të dhënat nga Scanner, përfshi dhe datën si String që
konvertohet në LocalDate*/
public class Sherbim {
    private String emerSherbimi;
    private String kategori;
    private double cmim;

    public Sherbim(String emerSherbimi, String kategori, double cmim) {
        this.emerSherbimi = emerSherbimi;
        this.kategori = kategori;
        this.cmim = cmim;
    }

    public String getEmerSherbimi() {
        return emerSherbimi;
    }

    public String getKategori() {
        return kategori;
    }

    public double getCmim() {
        return cmim;
    }

    public String toString() {
        return "- " + emerSherbimi + " (" + kategori + "), Çmim: " + cmim + " EUR";
    }
}

