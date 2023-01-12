// Write a program to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner;

public class _9CharIsAlphabetOrDigitOrSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;

        System.out.println("Enter Character:");
        c = sc.nextLine().charAt(0);

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("Character is Alphabet");
        } else if(c >= 0 && c <= 9) {
            System.out.println("Character is Number.");
        } else {
            System.out.println("Character is Special character.");
        }

        sc.close();
    }
}
