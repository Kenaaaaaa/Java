package JavaFundamentals_Revision;

import java.util.Scanner;

/*Shuma e katroreve te numrave tek , n terma nga perdoruesi
* */
public class Shuma_Katroreve_nrTek {

    //Metoda e Nr tek
    static double Shuma(int nr){
        double sh = 0;
        int count = 0;
        int i = 1; // Fillojme me numrin tek 1
        while(count < nr) {
            sh += Math.pow(i, 2); // Shto katrorin e numrit tek
            i += 2; // Kalojme ne numrin e ardhshëm tek
            count++; // Rritim numrin e iteracioneve
        }
        return sh;
    }





    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut nr qe do ");
        int nr=input.nextInt();
        System.out.println("Shuma e katroreve te numrave tek eshte "+ Shuma(nr));
    }
}
