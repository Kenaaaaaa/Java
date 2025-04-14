package Practise_Java_Fundamentals1;

import java.util.Scanner;

public class zanore_bashtingellore {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Futni shkronjen qe doni");
        char shkronja=input.nextLine().charAt(0);
        shkronja=Character.toLowerCase(shkronja);

        switch (shkronja){
            case 'a':
                System.out.println("Eshte zanore");
                break;
            case 'e':
                System.out.println("Eshte zanore");
                break;
            case 'i':
                System.out.println("Eshte zanore");
                break;
            case 'o':
                System.out.println("Eshte zanore");
                break;
            case 'u':
                System.out.println("Eshte zanore");
            default:
                System.out.println("Eshte bashtingellore ose karakter special");
        }
    }
}
