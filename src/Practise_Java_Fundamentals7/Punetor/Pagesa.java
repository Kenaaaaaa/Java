package Practise_Java_Fundamentals7.Punetor;

import java.time.LocalDate;

public class Pagesa {
    private Punetor[] punetoret;
    private LocalDate dataPageses;

    public Pagesa(Punetor[] punetoret, LocalDate dataPageses) {
        this.punetoret = punetoret;
        this.dataPageses = dataPageses;
    }

    public void afishoPunetorinMePagenMeTeLarte() {
        if (punetoret.length == 0) {
            System.out.println("Nuk ka punëtorë në listë.");
            return;
        }

        Punetor max = punetoret[0];

        for (int i = 1; i < punetoret.length; i++) {
            if (punetoret[i].llogaritPagen() > max.llogaritPagen()) {
                max = punetoret[i];
            }
        }

        System.out.println("Punëtori me pagën më të lartë në datën " + dataPageses + " është:");
        System.out.println(max.getEmri() + " me pagë totale: " + max.llogaritPagen() + " EUR");
    }
}

