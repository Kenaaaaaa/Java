package JavaFundamentals_Revision;
import java.util.Scanner;
public class Ushtrimi2_BMI {

        static void calculateBMI (float weight, int height) {
            float heightInMeter = (float)height/100;
            float BMI = weight/(heightInMeter*heightInMeter);
            if (BMI > 18.5 && BMI < 24.9) {
                System.out.println("BMI optimal => " + BMI);
            } else {
                System.out.println("BMI not optimal => " + BMI);
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Jep peshen ne kg: ");
            float weight = scan.nextFloat();
            System.out.println("Jep gjatesine ne cm: ");
            int height = scan.nextInt();

            calculateBMI(weight,height);
        }
    }

