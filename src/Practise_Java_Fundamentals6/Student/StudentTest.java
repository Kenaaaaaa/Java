package Practise_Java_Fundamentals6.Student;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lexo emrin e studentit
        System.out.print("Jep emrin e studentit: ");
        String emri = scanner.nextLine();

        // Lexo numrin e notave
        System.out.print("Sa nota ka studenti? ");
        int n = scanner.nextInt();
        int[] notat = new int[n];

        // Lexo notat një nga një
        System.out.println("Jep notat:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nota [" + (i + 1) + "]: ");
            notat[i] = scanner.nextInt();
        }

        // Krijo objektin Student dhe llogarit mesataren
        Student s1 = new Student(emri, notat);
        System.out.println("Nota mesatare e " + s1.getEmri() + " është: " + s1.llogaritMesataren());

        scanner.close();
    }
}
