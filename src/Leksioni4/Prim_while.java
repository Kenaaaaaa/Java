package Leksioni4;

import java.util.Scanner;

public class Prim_while {
    public static void main(String[] args) {
        int x = 2;
        boolean isPrim=true;
        Scanner input = new Scanner(System.in);
        System.out.println("Fut numrin qe do");

        int nr = input.nextInt();

        while (x < nr) {
        if(nr%x==0){
            isPrim=false;
            break;
        }
        x++;
        }

        if(isPrim){
            System.out.println("Eshte eshte prim");
        }
        else System.out.println("Nuk eshte prim");
    }
}
