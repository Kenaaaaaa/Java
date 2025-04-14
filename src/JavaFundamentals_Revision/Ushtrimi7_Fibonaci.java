package JavaFundamentals_Revision;

import java.util.Scanner;

/*Shkruani nje app qe merr nje numer positiv tipi int, dhe
* llogarit Nr Fibonaci , dhe do afishoje termin e 6, nese jep 5,
* do afishoje termin 2, nese jep 2 etc*/
public class Ushtrimi7_Fibonaci {

    //Metodfa Fibonaci
    static int Fibonaci(int nr){
        int count=0;
        int sh=0;
        int a=1,b=1,i;
            if(nr<=0){
                return 0;
            }

            if( nr == 1 || nr==2){
                    return 1;
            }

        for(i=3;i<=nr;i++){
            sh=a+b;
            a=b;
            b=sh;
        }


        return sh;
    }



    //Metoda main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut nr qe do ");
        int nr=input.nextInt();
        System.out.println("Nr ne pozicionin  = "+nr+ " eshte  "+Fibonaci(nr));
    }
}
