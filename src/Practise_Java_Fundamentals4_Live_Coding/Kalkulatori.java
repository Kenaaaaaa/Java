package Practise_Java_Fundamentals4_Live_Coding;

import java.util.Scanner;

/*Write an application that implements a simple calculator. The application should:
a. read first number (type float)
b. read one of following symbols: + - / *
c. read second number (type float)
d. return a result of given mathematical operation
If the user provides a symbol other than supported, the application should print "Invalid
symbol".  If  the  entered  action  cannot  be  implemented  (i.e.  it  is  inconsistent  with  the
principles of mathematics), the application should print "Cannot calculate".*/
public class Kalkulatori {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Fut numrin e pare");
        float numri1= input.nextFloat();

        System.out.println("Shkruaj operatorin (+,-,*,/) :");
        String operatori= input.next();

        System.out.println("Jep nr e dyte");
        float numri2=input.nextFloat();

        switch (operatori){
            case "+":
                System.out.println("Rezultati: "+(numri1+numri2));
                break;
            case "-":
                System.out.println("Rezultati: "+(numri1-numri2));
                break;
            case "*":
                System.out.println("Rezultati: " + (numri1 * numri2));
                break;
            case "/":
                if (numri2 == 0) {
                    System.out.println("Nuk mund të llogaritet");
                } else {
                    System.out.println("Rezultati: " + (numri1 / numri2));
                }
                break;
            default:
                System.out.println("Simbol i pavlefshëm");
        }
    }
}
