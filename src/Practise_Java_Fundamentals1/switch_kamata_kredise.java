package Practise_Java_Fundamentals1;

import java.util.Scanner;

public class switch_kamata_kredise {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Shkruaj llojin e kredise:(Makine, biznes, banese:)");
        String llojiKredise=input.nextLine().toLowerCase();
        double normaInteresit;

        switch(llojiKredise){
            case "makine":{
                normaInteresit=3.5;
                System.out.println("Norma e interesit eshte "+normaInteresit);
            }
                break;
            case "biznes":{
                normaInteresit=5.5;
                System.out.println("Norma e interesit eshte "+normaInteresit);
            }
                break;
            case "banese":{
                normaInteresit=4.6;
                System.out.println("Norma e interesit eshte "+normaInteresit);
            }
                break;
            default:
                System.out.println("Ju keni futur nje lloj kredie qe nuk ekziston");
        }
    }
}
