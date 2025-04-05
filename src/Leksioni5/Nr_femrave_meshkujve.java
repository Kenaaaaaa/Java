package Leksioni5;

import java.util.Scanner;

public class Nr_femrave_meshkujve {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //Lexon nr e studenteve
        System.out.println("Fut numrin e studenteve");
        int nr_studenteve=input.nextInt();
        int i;
        int nr_femrave=0,nr_djemve=0;

        //Krijojme nje array bosh me nr e studenteve qe do mbaje vlerat e meshkujve dhe femrave
        char[]gjinia=new char[nr_studenteve];

        //I thote perdoruesit te futi nese jane meshkuj ose femra
        for(i=0;i<gjinia.length;i++){
            System.out.println("Futni nese eshte mashkull ose femer");
            gjinia [i]=Character.toLowerCase(input.next().charAt(0));
            if(gjinia[i]=='f'){
                nr_femrave++;
            }
            else if(gjinia[i]=='m') {
                 nr_djemve++;
            }
        }
        System.out.println("Totali Femrave = "+nr_femrave+" \n Totali Djemve = "+nr_djemve);
    }
}
