package Practise_Java_Fundamentals4_Revision;
/*Shkruaj nje aplikacion qe ben calculator
* 1. duhet te lexoje nje numer float nga perdoruesi
* 2.duhet te lexoje nje simbol + - * /
3. lexon numrin e dyte float
4. return result sipas veprimit matematikor
* Nese jep nje simbol qe nuk suportohet duhet te printoje "Invalid Symbol,
* nese nuk mund te behet veprimi matematikor, duhet shkruajtor "Cannot Calculate  */


import java.util.Scanner;

public class Ushtrimi8_Calculator {

    //Metoda calculator
    static float Resultati(float a, float b, char c) {

        switch (c) {
            case '+': {
                return a + b;
            }
            case '*': {
                return a * b;
            }
            case '/': {
                if (b != 0) {
                    return a / b;
                }
                else{
                    System.out.println("Cannot Calculate ");
                    return Float.NaN;
                }
            }
            case '-':
                return a - b;
            default:
                System.out.println(" Invalid Symbol");
                return Float.NaN;
        }


    }





    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut numrin e pare ");
        float nr1=input.nextFloat();
        System.out.println("Fut numrin e dyte ");
        float nr2=input.nextFloat();
        System.out.println("Fut nje simbol per veprimin matematikor ");
        char symbol=input.next().charAt(0);
        if(symbol!='+'|| symbol!='-' || symbol!='*' || symbol!='/'){
            System.out.println("Invalid Symbol");
        }
        else{
            float result=Resultati(nr1,nr2,symbol);
            if(!Float.isNaN(result)){
                System.out.println("Can not calculate");

            }
            else{
                System.out.println("Resultati "+result);
            }
        }
    }

}
