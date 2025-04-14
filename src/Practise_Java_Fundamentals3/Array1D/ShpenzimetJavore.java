package Practise_Java_Fundamentals3.Array1D;

/*1.	Llogarit shpenzimet javore
Jepet një array double[] shpenzime = {23.5, 45.0, 19.9, 50.0, 38.2, 60.0, 20.0} (lexo te dhenat nga useri)
 që përfaqëson shpenzimet ditore. Gjej:
- Totalin e shpenzimeve
- Ditën me shpenzimin më të lartë
*/


import java.util.Scanner;

public class ShpenzimetJavore {

    //Metoda Totali i Shpenzimeve

    static double TotaliShpenzimeve(double[]shpenzime){
        double totali=0;
        for(int i=0;i<=shpenzime.length;i++){
                totali+=shpenzime[i];
            }
        return totali;
    }


    //Metoda Dita me Shpenzimin me te Larte
    static int DitaMax(double[]shpenzime) {
        double max = shpenzime[0];
        int i,index=0;
        for (i = 0; i < shpenzime.length; i++) {
            if (shpenzime[i] > max) {
                max = shpenzime[i];
                index=i;
            }
        }
        return index+1;
    }



    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double [] shpenzime = new double[7];
        //Lexo shpenzimet e perdoruesit per 1 jave
        System.out.println("Fut shpenzimet qe ke bere cdo dite per 1 jave");
        for (int i=0;i<shpenzime.length;i++){
            shpenzime[i]=input.nextDouble();
        }

        System.out.println("Totali i Shpenzimeve = "+ TotaliShpenzimeve(shpenzime));
        System.out.println("Dita me shpenzimet e larta eshte dita e "+DitaMax(shpenzime)+" -te");
    }
}
