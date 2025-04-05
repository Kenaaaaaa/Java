package Leksioni5;

import java.util.Scanner;

public class Metoda_Prim {

    static boolean Prim(int a){
        int i;
       boolean isPrim=true;
        for(i=2;i<a;i++){
            if(a%i==0){
                isPrim=false;
                break;
            }
            else{
                isPrim=true;
            }
        }
        return isPrim;
    }




    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Lexo nr
        System.out.println("Fut numrin qe do kontrollosh nese eshte Prim ose jo");
        int nr=input.nextInt();

        boolean kontrollo=Prim(nr);
        if(kontrollo==true){
            System.out.println("Numri eshte Prim");
        }
        else{
            System.out.println("Numri nuk eshte Prim");
        }
    }
}
