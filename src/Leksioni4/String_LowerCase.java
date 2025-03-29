package Leksioni4;

import java.util.Scanner;

public class String_LowerCase {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Fut nje fjale ");
        String fjala=input.next();
        System.out.println(fjala.toUpperCase().replace('E' , 'I'));
        System.out.println("Totali i karaktereve "+fjala.length());
    }
}
