package Leksioni4;

import java.util.Scanner;

public class Do_while_Shuma_Nr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Futni numrin qe doni");
        int shuma=0;
       do {
           int nr= input.nextInt();
           if(nr==-1) {
               break;
           }

               shuma+=nr;
       }
       while(true);
        System.out.println("Sh = "+shuma);

    }
}
