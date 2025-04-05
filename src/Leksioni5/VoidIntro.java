package Leksioni5;

/*Në Java, static përdoret për të deklaruar metoda që i përkasin klasës dhe jo një objekti të saj.
*/
import java.util.Scanner;


public class VoidIntro {


    static void AfishoMax(int a, int b){
        if(a>b){
            System.out.println("Max ="+a);
        }
        else{
            System.out.println("Max= "+b);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Fut numrin e pare
        System.out.println("Vendos numrin e pare");
        int nr1=input.nextInt();

        //Fut numrin e dyte
        System.out.println("Fut numrin e dyte ");
        int nr2=input.nextInt();

        AfishoMax(nr1,nr2);
        AfishoMax(3,5);
    }
}
