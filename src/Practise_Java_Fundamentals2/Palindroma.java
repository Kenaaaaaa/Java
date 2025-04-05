package Practise_Java_Fundamentals2;
/*5.	Shkruani një program që merr një fjalë nga përdoruesi dhe përdor një cikël Do While për të kontrolluar nëse fjala është e njëjtë (palindrome)
kur lexohet nga e djathta në të majtë.
Psh :
Input: ABA
Output: Palindrome
Input: Test
Output: Stringa nuk eshte palindrome
*/


import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fut nje fjale: ");
        String fjala = input.nextLine();


        // Konvertimi i fjales në lowercase për të bërë krahasimin case-insensitive
        fjala = fjala.toLowerCase();

        int i = 0;
        int j = fjala.length() - 1;
        boolean eshtePalindrome = true;

        do {
            if (fjala.charAt(i) != fjala.charAt(j)) {
                eshtePalindrome = false;
                break;
            }
            i++;
            j--;
        } while (i < j);

        if (eshtePalindrome) {
            System.out.println("Fjala eshte palindrome.");
        } else {
            System.out.println("Fjala nuk eshte palindrome.");
        }
    }
}