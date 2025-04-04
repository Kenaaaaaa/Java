package Leksioni2;

import java.util.Scanner;

public class Max_3_Numrave {
    public static void main(String[] args) {

        //Lexo nr1
        Scanner input=new Scanner(System.in);
        System.out.println("Fut numrin e pare");
        int nr1=input.nextInt();

        //Fut nr2
        System.out.println("Fut numrin e dyte");
        int nr2=input.nextInt();

        //Fut nr3
        System.out.println("Fut numrin e trete");
        int nr3=input.nextInt();

        int max;

        if(nr1>nr2 && nr1>nr3){
            max=nr1;
        } else
            if (nr2>nr1 && nr2>nr3) {
            max=nr2;
        }
            else {
                max=nr3;
            }
        System.out.println("Max = "+max);
    }
}
