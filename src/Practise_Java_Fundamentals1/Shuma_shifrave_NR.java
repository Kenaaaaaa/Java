package Practise_Java_Fundamentals1;
import java.util.Scanner;
/*2. Shuma e shifrave të një numri
- Shpjegimi: Programi lexon një numër dhe përdor një cikël while për të llogaritur shumën e
shifrave të tij.
- Shembull input: 123
- Shembull output: 1 + 2 + 3 = 6*/

public class Shuma_shifrave_NR {
    public static void main(String[] args) {
        //pyesim perdoruesin te fusi numrin
        Scanner input=new Scanner(System.in);
        System.out.println("Futni numrin qe deshironi");

        //numri i tipit intiger
        int nr=input.nextInt();
        int nr_fillestar=nr;
        int pjesa_plote,mbetja=0123,sum=0;
        while(nr>0){
          pjesa_plote=  nr/10;
          mbetja=nr%10;
            sum+=mbetja;
            nr=pjesa_plote;

        }
        System.out.println("Shuma e shifrave te numrit " +nr_fillestar+" = "+sum);
    }
}
