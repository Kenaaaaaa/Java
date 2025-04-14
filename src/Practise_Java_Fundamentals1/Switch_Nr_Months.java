package Practise_Java_Fundamentals1;

import java.util.Scanner;

public class Switch_Nr_Months {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Fut nje numer ");
        int nr=input.nextInt();

       switch(nr){
           case 1:
               System.out.println("Janar");
               break;
           case 2:
               System.out.println("Shkurt");
               break;
           case 3:
               System.out.println("Mars");
               break;
           case 4:
               System.out.println("Prill");
               break;
           case 5:
               System.out.println("Maj");
               break;
           case 6:
               System.out.println("Qershor");
               break;
           case 7:
               System.out.println("Korrik");
               break;
           case 8:
               System.out.println("Gusht");
               break;
           case 9:
               System.out.println("Shtator");
               break;
           case 10:
               System.out.println("Tetor");
               break;
           case 11:
               System.out.println("Nentor");
               break;
           case 12:
               System.out.println("Dhjetor");
           default:
               System.out.println("Nr i futur nuk eshte valid");

       }

    }
}
