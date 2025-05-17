package Practise_Java_Fundamentals7.Sherbim;

import java.time.LocalDate;

public class FatureSherbimi {
    private Sherbim[] sherbimet;
    private LocalDate dataSherbimit;

    public FatureSherbimi(Sherbim[] sherbimet, LocalDate dataSherbimit) {
        this.sherbimet = sherbimet;
        this.dataSherbimit = dataSherbimit;
    }

    public void afishoSherbimetDheMeTeShtrenjtin() {
        System.out.println("\n Data e shërbimit: " + dataSherbimit);
        System.out.println(" Shërbimet:");

        for (Sherbim s : sherbimet) {
            System.out.println(s);
        }

        // Gjej shërbimin me çmimin më të lartë
        Sherbim meICmimi = sherbimet[0];
        for (Sherbim s : sherbimet) {
            if (s.getCmim() > meICmimi.getCmim()) {
                meICmimi = s;
            }
        }

        System.out.println("\n Shërbimi me çmimin më të lartë:");
        System.out.println(meICmimi);
    }
}
