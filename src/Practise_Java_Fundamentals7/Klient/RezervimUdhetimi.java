package Practise_Java_Fundamentals7.Klient;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RezervimUdhetimi {
    private klient[] klientet;
    private LocalDate dataNisjes;
    private String vendndodhja;

    public RezervimUdhetimi(klient[] klientet, LocalDate dataNisjes, String vendndodhja) {
        this.klientet = klientet;
        this.dataNisjes = dataNisjes;
        this.vendndodhja = vendndodhja;
    }

    public void afishoDitetDeriNeNisje() {
        LocalDate sot = LocalDate.now();
        long diteMbetura = ChronoUnit.DAYS.between(sot, dataNisjes);

        if (diteMbetura >= 0) {
            System.out.println("📆 Kanë mbetur " + diteMbetura + " ditë deri në nisje.");
        } else {
            System.out.println("Data e nisjes ka kaluar.");
        }
    }

    public void afishoKlientinMeTeRi() {
        if (klientet.length == 0) {
            System.out.println("Nuk ka klientë në listë.");
            return;
        }

        klient meIRiu = klientet[0];
        for (klient k : klientet) {
            if (k.getMosha() < meIRiu.getMosha()) {
                meIRiu = k;
            }
        }

        System.out.println("👶 Klienti më i ri është: " + meIRiu);
    }
}
