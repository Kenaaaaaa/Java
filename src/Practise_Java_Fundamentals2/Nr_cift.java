package Practise_Java_Fundamentals2;
/*3.	Printoni të gjithë numrat çift nga 2 deri në N, duke perdorur ciklin FOR.

-	Shembull input:  N = 10

-	Shembull output:  2 4 6 8 10
*/


import java.util.Scanner;

public class Nr_cift {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("FUT NJE NUMER");
        int nr=input.nextInt();
        int i,j;
        for(i=1;i<=nr;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
