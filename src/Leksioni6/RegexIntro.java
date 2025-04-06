package Leksioni6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIntro {

    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Vendosni kodin promocional");
        String inputUser=sc.next();
        String regex="[A-Z]{2}[0-9]{4}";
        Pattern formula=Pattern.compile(regex);
        Matcher raport=formula.matcher(inputUser);

        if(raport.matches()){
            System.out.println("Kodi Promocional i vlefshem");
        }
        else {
            System.out.println("Kod i pavlefshem!");
        }

        if(raport.find()){
            System.out.println("Nje pjese e tekstit mban kodin promocional");
        }else {
            System.out.println("Kodi nuk ndodhet ne asnje pjese te teksit");
        }

    }
}
