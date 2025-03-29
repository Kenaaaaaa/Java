package Leksioni4;

import java.util.Scanner;

public class Shuma_Faktorialeve {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut numrin qe doni");

        int nr= input.nextInt();
        int i,j,sh=0,faktoriali=1;
        for(i=1;i<=nr;i++){
            faktoriali=1;
            for(j=1;j<=i;j++){
                faktoriali*=j;

            }
            sh+=faktoriali;

        }


        System.out.println("SH= "+sh);

    }

}
