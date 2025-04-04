package Practise_Java_Fundamentals;
/*. Gjetja e sezonit të vitit sipas muajit me switch
- Shpjegimi: Programi lexon një numër muaji (1-12) dhe përdor switch për të përcaktuar
sezonin (Dimër, Pranverë, Verë, Vjeshtë).
- Shembull input: 7
- Shembull output: "Verë"*/


import java.util.Scanner;

public class Stinet_Switch {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Fut nje numer per muajin dhe te themi stinen ku ben pjese");
        int nr= input.nextInt();

        switch(nr){
            case 1:
            case 2:
            case 3:
                System.out.println("Eshte dimer");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Eshte pranvere");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Eshte Vere");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Eshte Vjeshte");
            default:
                System.out.println("Nr nuk eshte valid");
        }

    }
}
