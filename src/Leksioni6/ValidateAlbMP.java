package Leksioni6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAlbMP {
    //Menyra e dyte me ane te metodave

    static  boolean CheckAlbanianNr(String numberText){

        boolean isAlbanian=false;

        Pattern patt= Pattern.compile("355[0-9]{9}");
        Matcher match=patt.matcher(numberText);

        isAlbanian=match.matches();

        return isAlbanian;
    }



    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Vendosni numrin e cel");
        String userMobile=scan.next();
        //String regex="355[0-9]{9}";
        Pattern patt=Pattern.compile("355[0-9]{9}");

        Matcher raportTekst=patt.matcher(userMobile);
        if (raportTekst.matches()){
            System.out.println("Numri i vendosur ka prefiks Shqiptar");
        }

        if(CheckAlbanianNr(userMobile)){
            System.out.println("Numri i vendosur ka prefiks Shqiptar");
        }

        if(raportTekst.find()){
            System.out.println("Ne tekstin e dhene ndodhet nje numer me prefiks shqiptar ");
        }





    }
}