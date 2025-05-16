package Practise_Java_Fundamentals4_Live_Coding;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(101); // number between 0 and 100
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Guess the number (between 0 and 100):");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > targetNumber) {
                System.out.println("Too much");
            } else if (guess < targetNumber) {
                System.out.println("Not enough");
            } else {
                System.out.println("Congratulations!");
                break;
            }
        }

        scanner.close();
    }
}
