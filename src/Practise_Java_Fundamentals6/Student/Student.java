package Practise_Java_Fundamentals6.Student;

public class Student {
    private String emri;
    private int [] notat;

    //Konstruktori
    public Student(){}

    //Konstruktori
    public Student(String emri, int[]notat){
        this.emri=emri;
        this.notat=notat;
    }

    //Metoda qe llogarit noten mesatare

    public double llogaritMesataren(){
        int sh=0;
        for (int i = 0; i < notat.length; i++) {
            System.out.println(notat[i]);
        }

        if (notat.length > 0) {
            return (double) sh / notat.length;
        } else {
            return 0;
        }
    }

    //GETTERS

    public int[] getNotat() {
        return notat;
    }

    public String getEmri() {
        return emri;
    }
}
