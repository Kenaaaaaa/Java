package Leksioni4;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Fusni numrin qe doni te  afishoni n terma");
        int nr= input.nextInt();
        int count,i,a=1,b=1,c=0,temp;
        for(count=0;count<nr;count++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
