package Practise_Java_Fundamentals2;

import java.util.Scanner;

/*2.	Printimi i një trekëndëshi të përmbysur me numra
-	Printoni një trekëndësh të përmbysur ku çdo rresht fillon me N dhe zbret deri në 1.
-	Shembull input: N = 5
-	Shembull output:

5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
public class Trekendesh_Numra {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Fut numrin qe do ");
        int nr= input.nextInt();
        int i,j;

        for (i=nr;i>=1;i--){
            for (j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
