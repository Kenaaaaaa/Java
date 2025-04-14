package Practise_Java_Fundamentals1;
import java.util.Scanner;
/*1. Printimi i numrave tek deri në një numër të dhënë
- Shpjegimi: Programi duhet të lexojë një numër n nga përdoruesi dhe të përdorë një cikël
while për të printuar të gjithë numrat tek nga 1 deri tek n.
- Shembull input: 10
- Shembull output: 1, 3, 5, 7, 9*/

public class PrintNr_UpTo_a_Nr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in)   ;
        System.out.println("Fusni nje numer");
        int nr=input.nextInt();
        int i=1;
        while(i<=nr){
            System.out.println(i);
            i+=2;
        }
    }
}
