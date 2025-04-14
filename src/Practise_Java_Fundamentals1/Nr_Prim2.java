package Practise_Java_Fundamentals1;

import java.util.Scanner;

public class Nr_Prim2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut numrin qe do te kontrollosh a eshte Prim apo jo ");
        int nr= input.nextInt();
        int i;
         if(nr==2){
             System.out.println("Numri eshte i thjeshte");
         }
        for (i=2;i<nr;i++){
            if(nr%i==0){
                System.out.println("Numri "+nr+" nuk eshte prim");
                break;
            }
            else{
                System.out.println("Numri "+nr+"  eshte prim");
                break;
            }
        }

    }
}
