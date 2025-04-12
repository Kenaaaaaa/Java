package Leksioni6.KlasaBuilding;

import java.util.Scanner;

public class testBuilding {
    public static void main(String[] args) {

        //Do ti marrim nga konstruktori bosh do bejme nje kopje te tij
        Building building1=new Building();
        Scanner input= new Scanner(System.in);
        System.out.println("Fut tipologjine ");
        building1.tipologjia=input.next();
        System.out.println("Fut cmimin e baneses ");
        building1.cmimiM2=input.nextFloat();
        System.out.println("Fut nr e Kateve");
        building1.nrKateve=input.nextInt();
        System.out.println("Fut adresen e baneses");
        building1.adresa=input.next();
        System.out.println("Fut sconto ");
        building1.sconto=input.nextInt();
        System.out.println("Fut siperfaqen");
        building1.siperfaqe=input.nextFloat();

        //Afisho te dhenat per building 1
        building1.Afisho();

        //Llogarit cmimin pas skontos per building 1
        System.out.println("Cmimi pas skontos eshte "+building1.LlogaritCmimin(building1.cmimiM2, building1.siperfaqe, building1.sconto));


        //Do te bejme nje konstruktor qe merr direkt informacionet per BUilding 2
        System.out.println("Fut te dhenat per building 2");
        System.out.println("Fut siperfaqen");
        float siperfaqe=input.nextFloat();
        System.out.println("Fut cmimin e baneses ");
        float cmimiM2=input.nextFloat();
        System.out.println("Fut tipologjine ");
        String tipologjia=input.next();
        System.out.println("Fut sconto ");
        int sconto=input.nextInt();
        Building building2= new Building(siperfaqe, cmimiM2, tipologjia, sconto);
        building2.Afisho();
        System.out.println(building2.LlogaritCmimin(cmimiM2,siperfaqe,sconto));



    }
}
