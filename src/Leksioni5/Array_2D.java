package Leksioni5;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        int i, j;
        //Fut vlera nga perdoruesi
        Scanner input=new Scanner(System.in);

        System.out.println("Fut numrin e rreshtave");
        int nr_rreshtave=input.nextInt();


        System.out.println("Fut numrin e kolonave");
        int nr_kolonave=input.nextInt();

        int[][] vlera= new int[nr_rreshtave][nr_kolonave];

        for (i =0;i<vlera.length;i++){
            for(j=0;j<vlera[i].length;j++){
                System.out.println("Fut nje vlere");
                vlera[i][j]=input.nextInt();
            }
        }
        int max=vlera[0][0];
        //shfaq vlerat
        for (i =0;i<vlera.length;i++){
            for(j=0;j<vlera[i].length;j++) {
                System.out.print(vlera[i][j] + "\t");
            }
                System.out.println();

            }

            //gjej maksimumin
            for (i =0;i<vlera.length;i++){
                for(j=0;j<vlera[i].length;j++){
                    if(vlera[i][j]>max){
                        max=vlera[i][j];
                    }

                }
            }
        System.out.println("Max = "+max);

    }
}
