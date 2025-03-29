package Leksioni4;

import java.util.Scanner;

public class Afisho_nr {
    public static void main(String[] args) {

        //afisho nr nga 1 2 4 5 6 , deri tek nr
        Scanner input= new Scanner(System.in);
        System.out.println("Fut numrin qe do");
        int nr=input.nextInt();
        int i;
        for(i=1;i <=nr;i++){
            if(i==3){
                continue;
            }
            System.out.println("Numrat nga 1 deri tek numri i dhene "+i+"\n");
        }

        //afisho numrat deri tek nr/2
        float j;
        for(j=1;j<=(nr/2);j++){
            System.out.println(j);
        }
    }
}
