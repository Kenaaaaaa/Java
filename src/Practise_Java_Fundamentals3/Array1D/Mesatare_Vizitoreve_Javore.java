package Practise_Java_Fundamentals3.Array1D;
/*6.	Jepet int[] vizitore = {340, 560, 290, 610, 730, 400, 310}
 (lexo te dhenat nga useri) që përfaqëson vizitat ditore.
  Llogarit mesataren javore.*/


import java.util.Scanner;

public class Mesatare_Vizitoreve_Javore {


    //Metoda Mesatare
    static double Mesatare(int[]vizitore){
        double mes,sh=0;
        for(int i=0;i<vizitore.length;i++){
            sh+=vizitore[i];
        }
        mes=sh/vizitore.length;
        return mes;

    }


    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Deklaro dhe Inicializo Array ku do mbahet nr i vizitoreve
        int[]vizitore=new int[7];

        //Lexo nr e vizitoreve per nje jave
        System.out.println("Shkruaj numrin e vizitoreve per cdo dite te javes ");
        for(int i=0;i<vizitore.length;i++){
            vizitore[i]=input.nextInt();
        }
        System.out.println("Mesatarja javore e vizitoreve = "+Mesatare(vizitore));
    }
}
