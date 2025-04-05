package Practise_Java_Fundamentals2;
/*4.	Lexoni një numër N nga useri dhe printoni N termat e fuqive të 2.

-	Shembull input:

-	N = 5

-	Shembull output:

-	1 2 4 8 16
*/

import java.util.Scanner;

public class printo_n_fuqi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut nje numer");
        int nr=input.nextInt();
        int fuqi=1,i;

        for(i=0;i<nr;i++){
            System.out.println(fuqi);

            fuqi=2<<i;
        }

    }
}
