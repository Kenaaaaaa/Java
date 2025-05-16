package Practise_Java_Fundamentals4_Live_Coding;
/*Write  an  application  that  will  read  diameter  of  a  circle  (variable  of  type  float)  and
calculate perimeter of given circle.
Firstly, assume π = 3.14. Later, use value of π from built-in Math class.*/
import java.util.Scanner;

public class Perimeter_Circle {
    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Lexojme diametrin nga perdoruesi
        System.out.println("Jep diametrin e rrethit ");
        float diameter=input.nextFloat();

        //LLogarit perimetrin me pi =3.14
        float pi=3.14f;
        float perimeter=pi*diameter;
        System.out.println("Perimeter  "+perimeter);

        //LLogarit perimeter duke perodur Math.PI
        double perimeterSakte=Math.PI*diameter;
        System.out.println("Perimeter : "+perimeterSakte);
    }
}
