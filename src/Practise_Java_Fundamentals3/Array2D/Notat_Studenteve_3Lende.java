package Practise_Java_Fundamentals3.Array2D;


/*	Njoftim për notat e studentëve në 3 lëndë
Jepet int[][] nota = {{8, 9, 7}, {6, 5, 10}, {9, 10, 8}}.
 Çdo rresht është një student, kolonat janë lëndë.
 Gjej notën mesatare për çdo student.
*/

import java.util.Scanner;

public class Notat_Studenteve_3Lende {

    //Metoda Nota Mesatare
    static double[] NotaMesatare(int[][]nota){
        double mes;
        double[]notaMesatare=new double[nota.length];
        for(int i=0;i<nota.length;i++){
            int sh=0;
            for(int j=0;j<nota[i].length;j++){
                sh+=nota[i][j];
            }
            mes=(double) sh/nota[i].length;
            notaMesatare[i]=mes;
        }
        return notaMesatare;
    }

    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //lexo sa studente
        System.out.println("Sa studente jane ");
        int nrStudenteve=input.nextInt();

        //lexo sasine  elendeve
        System.out.println("Sa lende jane ?");
        int nrLendeve=input.nextInt();

        //Deklaro dhe Inicializo Matricen nota

        int [][] nota= new int[nrStudenteve][nrLendeve];

        //Fut notat per cdo student
        System.out.println("Fusni notat per cdo studente ");
        for (int i = 0; i < nota.length; i++) {
            for (int j = 0; j < nota[i].length; j++) {
                nota[i][j]=input.nextInt();
            }
        }
        //Afishimi i notave mesatare per cdo student
        double[]notaMesatare=NotaMesatare(nota);
        for(int i=0;i<notaMesatare.length;i++){
            System.out.print("Nota Mesatare per studentin "+ (i+1)+ " eshte "+notaMesatare[i]+"\n");
        }


    }
}
