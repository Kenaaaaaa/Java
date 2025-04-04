package Leksioni4;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Fusni numrin qe doni te  afishoni n terma");
        int nr= input.nextInt();
        int count,i,a=0,b=1,c=0,temp;
        if(nr>=1){
            System.out.println(a);
        }
        if(nr>=2){
            System.out.println(b);
        }
        for(count=3;count<=nr;count++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
