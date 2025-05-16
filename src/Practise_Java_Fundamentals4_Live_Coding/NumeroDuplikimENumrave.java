package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that reads  from the user 10 arbitrarily large numbers (variables of
type int) and prints those that occurred at least twice.*/
import java.util.Scanner;
import java.util.HashMap;

public class NumeroDuplikimENumrave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> numberCounts = new HashMap<>();

        System.out.println("Shkruaj 10 numra (të tipit int):");

        // Lexo 10 numra dhe ruaji në një hartë me numërime
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            numberCounts.put(num, numberCounts.getOrDefault(num, 0) + 1);
        }

        System.out.println("Numrat që janë përsëritur të paktën dy herë:");
        boolean found = false;
        for (int num : numberCounts.keySet()) {
            if (numberCounts.get(num) >= 2) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Asnjë numër nuk është përsëritur.");
        }
    }
}

