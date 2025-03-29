package Practise_Java_Fundamentals;
import java.util.Scanner;

/*Gjetja e numrit më të madh nga disa numra
- Shpjegimi: Programi lexon disa numra (ndalon me -1) dhe përdor një kusht if për të gjetur
numrin më të madh.
- Shembull input: 10, 25, 17, 8, -1
- Shembull output: Numri më i madh është: 25*/


public class Nr_me_Madh_ne_Disa_Numra {
    public static void main(String[] args) {

        //lexo numrin
        Scanner input= new Scanner(System.in);
        System.out.println("Futni numrat qe doni");
        int max = Integer.MIN_VALUE;


        while(true) {
            int nr = input.nextInt();
            if (nr == -1)
                break;


            if (nr > max) {
                max = nr;
            }


        }
        System.out.println("Max =" + max);

    }
}








