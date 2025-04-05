package Leksioni5;

import java.util.Scanner;

public class ArraysInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalElemente;
        System.out.println("Me percakto numrin e reviews");
        totalElemente=sc.nextInt();

        float[] avgReviews=new float[totalElemente];

        for (int i=0;i<totalElemente;i++){
            System.out.println("Vendos review");
            avgReviews[i]=sc.nextFloat();
        }

        for (int i=0; i<totalElemente;i++){
            System.out.print(avgReviews[i]+"\t");
        }


    }
}
