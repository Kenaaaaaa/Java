package Leksioni5;

import java.util.Scanner;

public class Afisho_Elementet_Array {

    static void Tabela (int []arr){
        int i;
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Pyet perdoruesin, se sa vlera do ne tabele
        System.out.println("Sa vlere do ne tabele ?");
        int sasia_vlerave=input.nextInt();
        int i,nr;
        int []Tab= new int[sasia_vlerave];

        // Fut vlerat e nje tabele
        for(i=0;i<Tab.length;i++){

            System.out.println("Fut numrat ne tabele ");
            Tab[i]=input.nextInt();
        }
    Tabela(Tab);





        }
}
