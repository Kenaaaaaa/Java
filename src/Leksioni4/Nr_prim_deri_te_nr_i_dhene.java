package Leksioni4;

import java.util.Scanner;

public class Nr_prim_deri_te_nr_i_dhene {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fut numrin qe doni");
        int nr = input.nextInt();
        int x = 2, i,j;

        for (i = 2; i < nr; i++) {
            boolean isPrim = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrim = false;
                    break;
                }


            }
            if(isPrim){
                System.out.println("Numrat prim deri tek numri i futur jane  "+i);                }
            }


    }
    }

