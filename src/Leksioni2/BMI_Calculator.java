package Leksioni2;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fut peshen tuaj qe do");
        float pesha= (float)input.nextFloat();

        System.out.println("Fut gjatesine tuaj qe do");
        float gjatesia= (float)input.nextFloat();

        float bmi=pesha/(gjatesia*gjatesia);

        if(bmi>=25){
            System.out.println("Je mbipeshe");
        }
        else
            if(bmi>=18.5){
            System.out.println("Pesha juaj eshte normale");
        }
        else
            System.out.println("Je nenpeshe");

    }
}
