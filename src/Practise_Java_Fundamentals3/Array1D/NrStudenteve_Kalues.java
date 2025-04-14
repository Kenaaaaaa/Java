package Practise_Java_Fundamentals3.Array1D;

/*3.	Numëro sa studentë kanë kaluar provimin
Jepet një array int[] nota = {6, 7, 4, 9, 10, 5}
(lexo te dhenat nga useri).
 Numëro sa studentë kanë notë më të madhe ose të barabartë me 6.
*/


import java.util.Scanner;

public class NrStudenteve_Kalues {

    //Metoda qe kthen sa studente jane kalues

    static int nrStudenteveKalues(int[]nota){
        int kalues=0;
        for(int i=0;i<nota.length;i++){
            if(nota[i]>4){
                kalues++;
            }
        }
        return kalues;
    }


    //Metoda qe kthen sa studente e kane noten me te madhe ose te barabarte me 6
    static int nrStudenteveGreaterThanSix(int[]nota){
        int count=0;
        for(int i=0;i<nota.length;i++){
            if(nota[i]>=6){
                count++;
            }
        }
        return count;
    }


    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Pyet studentin sa nota do te fusi
        System.out.println("Sa nota doni te fusni ");
        int nrNotave=input.nextInt();

        //Krijo Array ku do te mbash notat
        int[]nota= new int[nrNotave];

        //Lexo notat nga studenti
        System.out.println("Fusni notat qe keni marre");
        for(int i=0;i<nota.length;i++){
            nota[i]=input.nextInt();
        }
        System.out.println(nrStudenteveKalues(nota)+ " studente jane kalues");
        System.out.println(nrStudenteveGreaterThanSix(nota)+" studente kane marre 6 ose me shume se 6");
    }
}
