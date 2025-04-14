package JavaFundamentals_Revision;

import java.util.Scanner;

/*te behen 0 te gjithe elementet e matrices pervec diagonales kryesore dhe diagonales dytesore*/
public class Matrica_zevendeso_zero {

    //Metoda te vendosim 0 mbi dhe poshte

    static void zero_Diagonale(int[][]tab, int permasat) {
        int i, j;
        for (i = 0; i < permasat; i++) {
            for (j = 0; j < permasat; j++) {
                if (i != j && i + j != permasat - 1) {
                    tab[i][j] = 0;
                }
            }
        }

    }


    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //merr nr nga perdoruesit
        //Lexo permasen e matrices
        System.out.println("Jep permasat e matrices ");
        int permasat=input.nextInt();
        int[][]tab=new int[permasat][permasat];

        //Merr nr e matrices
        int i,j;

        for(i=0;i<permasat;i++){
            for(j=0;j<permasat;j++){
                tab[i][j]=input.nextInt();
            }
        }
        zero_Diagonale(tab,permasat);
        for(i=0;i<permasat;i++){
            for(j=0;j<permasat;j++){
                System.out.print(tab[i][j] + " \t");
            }
            System.out.println();
        }
    }

}
