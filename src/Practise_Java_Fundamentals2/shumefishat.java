package Practise_Java_Fundamentals2;
/*1.	Numrat që janë shumëfish i një numri të dhënë
-	Lexoni një numër X dhe printoni shumëfishët e tij deri në N duke përdorur for.
-	Shembull input: X = 3, N = 15
-	Shembull dalje: 3 6 9 12 15
*/


import java.util.Scanner;

public class shumefishat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Futni nje numer");
        int x=input.nextInt();
        System.out.println("Futni deri ne cfare numri doni te afishoni shumefishat");
        int n=input.nextInt();
        int i;

        for(i=1;i*x<n;i++){

            System.out.println(i*x);
        }

            }


        }


