package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application calculating BMI (Body Mass Index) and checking if it’s optimal or not.
Your application should read two variables: weight (in kilograms, type float) and height
(in centimeters, type int). BMI should be calculated given following formula:
The  optimal  BMI  range  is  from  18.5  to  24.9,  smaller  or  larger  values  are  non-optimal
values. Your program should write "BMI optimal" or "BMI not optimal", according to the
assumptions above.*/

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Lexo peshen ne kg
        System.out.println("Jep peshen ne kg");
        float pesha=input.nextFloat();

        //Lexo gjatesin ne cm
        System.out.println("Jep gjatesine ne cm ");
        int gjatesia=input.nextInt();

        //Konverto gjatesine ne m
        float gjatesiaM=gjatesia/100.0f;

        //Llogarit BMI
        float bmi=pesha/(gjatesiaM*gjatesiaM);

        //printo vleren e BMI
        System.out.println("BMI jote : "+ bmi);

        //Kontrollo BMI

        if(bmi>=18.5 && bmi<=24.9){
            System.out.println("BMI eshte ok");
        }
        else{
            System.out.println("BMI eshte jashte normave ");
        }
    }
}
