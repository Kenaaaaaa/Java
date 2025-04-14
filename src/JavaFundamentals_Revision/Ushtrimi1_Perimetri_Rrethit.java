package JavaFundamentals_Revision;
/**/
import java.util.Scanner;
public class Ushtrimi1_Perimetri_Rrethit {
    static float perimeterRrethi1 (float diameter) {
        if(diameter < 0) {
            System.out.println("Diameter i pavlefshem!");
            return -1.0f;
        } else {
            return 3.14f * diameter;
        }
    }

    static float perimeterRrethi2 (float diameter) {
        if(diameter < 0) {
            System.out.println("Diameter i pavlefshem!");
            return -1.0f;
        } else {
            return (float)Math.PI * diameter;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jep diametrin e rrethit: ");
        float diameter = scan.nextFloat();

        float perimeter1 = perimeterRrethi1(diameter);
        float perimetri2 = perimeterRrethi2(diameter);

        System.out.println("Perimetri me Pi fikse 3.14 eshte: " + perimeter1);
        System.out.println("Perimetri me Pi nga klasa Math eshte: " + perimetri2);
    }
}