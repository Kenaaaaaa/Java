package Leksioni5;

import java.util.Scanner;

public class Kontrollo_ne_Array {

    static boolean CheckIfPresent(int[]data,int vlera) {
        boolean isPresent = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == vlera) {
                isPresent = true;
                break;
            }

        }
        return isPresent;
    }


    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.println("Fut vleren qe do ");
            int nr_kerkuar=input.nextInt();
            int i;
            System.out.println("Sa vlera doni ?");
            int nr_elem=input.nextInt();
            int[]vlera=new int[nr_elem];

            for(i=0;i<vlera.length;i++){
                System.out.println("Fut elementet e tabeles");
                int nr=input.nextInt();
                vlera[i]=nr;
            }
            boolean kontrollo=(CheckIfPresent(vlera,nr_kerkuar));

            if(kontrollo==true){
                System.out.println("VLera e kerkuar ndodhet ne tabele ");
            }
            else{
                System.out.println("Vlera e kerkuar nuk ndodhet ne tabele ");
            }

        }
    }

