package Practise_Java_Fundamentals3.Array2D;


import java.util.Scanner;

/*	Nxjerr të dhënat diagonale të një matrice 3x3
Jepet një matricë 3x3 int[][] matrica = {{1,2,3},{4,5,6},{7,8,9}}.
 Shfaq elementët e diagonales kryesore dhe dytësore.


*/
public class Diagonale_Kryesore_Dytesore {

    //Metoda Diagonale Dytesore
    static void DiagonaleDytesore(int[][]matrica){
        System.out.print("Elementet e Diagonales Dytesore ");

        for(int i=0;i< matrica.length;i++){
            for(int j=0;j<matrica[i].length;j++){
                if((i+j)== matrica.length-1){
                    System.out.print(matrica[i][j]+" ");
                }
            }
        }
    }

    //Metoda Diagonale Kryesore
    static void DiagonaleKryesore(int[][]matrica){
        System.out.print("Elementet e Diagonales Kryesore ");
        for(int i=0;i< matrica.length;i++){
            for(int j=0;j<matrica[i].length;j++){
                if(i==j){
                    System.out.print( matrica[i][j]+" ");
             }
            }
        }
    }


    //Main
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

        System.out.println("Sa rreshta ka matrica ?");
        int rreshta=input.nextInt();

        System.out.println("Sa shtylla ka matrica ?");
        int shtylla=input.nextInt();

        //Deklaro dhe inicializo matricen
        int[][] matrica= new int[rreshta][shtylla];

        //Lexo Vlerat nga Perdoruesi
        System.out.println("Fusni vlerat e matrices");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                matrica[i][j]=input.nextInt();
            }
        }
        //Afisho elmentet e diagonales kryesore
        DiagonaleKryesore(matrica);

        //Afisho elementet e diagonales dytesore
        DiagonaleDytesore(matrica);
    }
}
