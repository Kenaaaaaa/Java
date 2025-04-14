package JavaFundamentals_Revision;

    import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

    public class DataExercise2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Shkruaj datën e lindjes (viti-muaji-dita): ");
            String input = sc.nextLine();

            LocalDate dataLindjes = LocalDate.parse(input);
            LocalDate sot = LocalDate.now();

            Period mosha = Period.between(dataLindjes, sot);

            System.out.println("Ti je " + mosha.getYears() + " vjeç.");
        }
    }

