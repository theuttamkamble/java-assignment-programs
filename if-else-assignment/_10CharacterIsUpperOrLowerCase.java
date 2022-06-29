// Write a program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;
public class _10CharacterIsUpperOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.println("Enter a character: ");
        ch = sc.nextLine().charAt(0);

        if (ch > 'a' && ch < 'z') {
            System.out.println("Entered character is lower case.");
        } else if(ch > 'A' && ch < 'Z') {
            System.out.println("Entered character is UPPER case.");
        } else {
            System.out.println("Invalid character!");
        }

        sc.close();
    }
}
