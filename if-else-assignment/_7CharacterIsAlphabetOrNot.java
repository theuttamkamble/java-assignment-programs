// Write a program to check whether a character is alphabet or not.

import java.util.Scanner;
public class _7CharacterIsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = '*';

        System.out.println("Enter Character:");
        c = sc.nextLine().charAt(0);

        if((c >='a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("Character is Alphabet.");
        } else {
            System.out.println("Character is not Alphabet!");
        }

        sc.close();
    }
}
