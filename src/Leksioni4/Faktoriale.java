package Leksioni4;

import java.util.Scanner;

public class Faktoriale {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Fut numrin");
        int nr=input.nextInt();
        int i, prodhimi=1;

        for (i=nr;i>=1;i--){
            prodhimi*=i;
        }
        System.out.println("Faktoriali "+prodhimi);
    }
}
