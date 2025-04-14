package JavaFundamentals_Revision;
/*shiko nese numrat e matrices mbi dhe poshte diagonales kane te njejtjen vlere
* dhe duhet qe te kthejme true */
import java.util.Scanner;

public class Matrica_Simetrike {

    //Metoda simetrike

    static boolean eshteSimetrike(int tab[][],int permasat){
        int i,j;
        boolean simetrike=true;
        for (i=0;i<permasat;i++){
            for(j=0;j<tab[i].length;j++){
                if(tab[i][j]!=tab[j][i]){
                    return false;
                }
            }
        }


           return true;

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
        if (eshteSimetrike(tab, permasat)) {
            System.out.println("Matrica eshte simetrike.");
        } else {
            System.out.println("Matrica nuk eshte simetrike.");
        }

    }
}
