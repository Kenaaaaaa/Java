package Practise_Java_Fundamentals7.Libri;

import java.time.LocalDate;

public class Porosi {
    private Libri[] librat;
    private LocalDate dataPorosie;

    public Porosi(Libri[] librat, LocalDate dataPorosie) {
        this.librat = librat;
        this.dataPorosie = dataPorosie;
    }

    public void afishoTotaliDheMeTeShtrenjtin() {
        if (librat.length == 0) {
            System.out.println("Porosia nuk ka libra.");
            return;
        }

        float total = 0;
        Libri meICmimi = librat[0];

        for (Libri l : librat) {
            total += l.getCmimi();
            if (l.getCmimi() > meICmimi.getCmimi()) {
                meICmimi = l;
            }
        }

        System.out.println("\n📚 Data e porosisë: " + dataPorosie);
        System.out.println("💰 Totali i porosisë: " + total + " EUR");
        System.out.println("📖 Libri më i shtrenjtë: \"" + meICmimi.getTitulli() + "\" me çmim " + meICmimi.getCmimi() + " EUR");
    }
}
