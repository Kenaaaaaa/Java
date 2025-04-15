package Practise_Java_Fundamentals3.Klasat.KandidatIntervista;

import java.util.Scanner;

public class testAplikimPune {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

    //Krijojme nje objekt per Konstruktorin bosh
        AplikimPune aplikanti1=new AplikimPune();
        System.out.println("Emri  :");
        aplikanti1.setEmri(input.next());
        System.out.println("Vitet e Eksperiences :");
        aplikanti1.setViteEksperience(input.nextInt());
        System.out.println("Niveli i arsimimit");
        aplikanti1.setEdukimi(input.next());
        System.out.println("A ke cerftifikime? true/false");
        aplikanti1.setKaCertifikime(input.nextBoolean());

        if(aplikanti1.kualifikohetPerInterviste(aplikanti1.getViteEksperience(),aplikanti1.getEdukimi(),aplikanti1.isKaCertifikime()==true)){
            System.out.println("Aplikanti i pare kualifikohet per interviste");
        }
        else{
            System.out.println("Nuk kualifikohet");
        }

        //APLIKANTI 2
        //Ia inicializojme menjehre parametrat objektit te dyte
        System.out.println("Emri  :");
        String emri=input.next();
        System.out.println("Vitet e Eksperiences :");
        int vitEksperience=input.nextInt();
        System.out.println("Niveli i arsimimit");
        String edukimi=input.next();
        System.out.println("A ke cerftifikime? true/false");
        boolean kaCertifikime=input.nextBoolean();

        AplikimPune aplikanti2=new AplikimPune(emri,vitEksperience,edukimi,kaCertifikime);
        if((aplikanti2.kualifikohetPerInterviste(vitEksperience,edukimi,kaCertifikime)==true)){
            System.out.println("Aplikanti i dyte kualifikohet per interviste");
        }
        else{
            System.out.println("Aplikanti i dyte Nuk kualifikohet");
        }
    }
}
