// Write a program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;
public class _8AlphabetIsVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        
        System.out.println("Enter Alphabet: ");
        ch = sc.nextLine().charAt(0);

        if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || 
        ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))) {
            System.out.println("Alphabet is Vowel.");
        } else {
            System.out.println("Alphabet is Consonant.");
        }
    }
}
