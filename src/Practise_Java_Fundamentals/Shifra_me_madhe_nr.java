package Practise_Java_Fundamentals;
/*. Gjetja e shifrës më të madhe në një numër
- Shpjegimi: Programi lexon një numër dhe përdor while për të gjetur shifrën më të madhe
brenda tij (672 → 7).
- Shembull input: 4938
- Shembull output: Shifra më e madhe është: 9*/

import java.util.Scanner;

public class Shifra_me_madhe_nr {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Fut nje numer");

        int[] tab=new int[10];
        int i=0;
        int n= input.nextInt();
        int mbetja;
        while(n>0){
            mbetja=n%10;
            tab[i]=mbetja;
            n=n/10;
            i++;
        }

        int max=tab[0];

        for(i=0;i<tab.length;i++){
            if(tab[i]>max){
                System.out.println("Shifra me e madhe ne numrin e futur eshte "+tab[i]);

            }
        }

    }
}
