package Practise_Java_Fundamentals4_Live_Coding;
/*Write an application that takes 10 numbers from the user (type int) and write the length
of the longest such subsequence of these numbers, which is increasing.
For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
as the length of the longest increasing subsequence (underlined in the example).*/
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.println("Shkruaj 10 numra (int):");
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }

        // Array për të ruajtur gjatësinë e nën-sekuencës më të gjatë që përfundon në secilën pozicion
        int[] lis = new int[10];

        // Fillimisht, çdo element është një subsekuencë me gjatësi 1
        for (int i = 0; i < 10; i++) {
            lis[i] = 1;
        }

        // Llogarit LIS me algoritëm klasik dinamik
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // Gjej maksimumin nga lis[]
        int max = lis[0];
        for (int i = 1; i < 10; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }

        System.out.println("Gjatësia e nën-sekuencës më të gjatë në rritje është: " + max);
    }
}
