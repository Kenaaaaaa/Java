package Practise_Java_Fundamentals;

import java.util.Scanner;
/*Interpretimi i semaforit sipas shkronjës me switch
- Shpjegimi: Programi lexon një shkronjë (R, Y, G) dhe përdor switch për të treguar se çfarë
ngjyre është semafori.
- Shembull input: "R"
- Shembull output: "Semafori është i kuq."
*/
public class Semafori_Switch {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Fut R-red, G-green ose O-Orange");

        char color=input.nextLine().charAt(0);
        color=Character.toLowerCase(color);

        switch (color){
            case 'g':
                System.out.println("Semafori eshte jeshil");
                break;
            case 'o':
                System.out.println("Semafori eshte portokalli");
                break;
            case 'r':
                System.out.println("Semafori eshte i kuq");
                break;
            default:
                System.out.println("Karakteri i futur nuk eshte valid per programin");
        }
    }
}
