package Ushtrimi3_Dallori;

import java.util.Scanner;

public class Dallori_Metodat {

    static void Dallori(int a, int b, int c){
        int dalloriResult=(b*b)-4*a*c;
        // double dallori result =Math.pow((b,2)-4*a*c

        if(dalloriResult<0){
            System.out.println("Dallori negativ nuk ka zgjidhje");
        }
        else{
            double x1= (-b-Math.sqrt(dalloriResult))/2*a;
            double x2= (-b+Math.sqrt(dalloriResult))/2*a;

        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b ,c;
        System.out.println("Vendos koeficinetin a");
        a=input.nextInt();
        System.out.println("Vendos koeficinetin b");
        b=input.nextInt();
        System.out.println("Vendos koeficinetin c");
        c=input.nextInt();
         Dallori(a,b,c);
    }
}
