// Write a program to print all natural numbers in reverse (from n to 1). - using while loop

import java.util.Scanner;
public class NaturalNumberFromNto1Reverse {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();

        int i = num;
        while(i >= 1) {
            System.out.println(i);
            i--;
        }

        sc.close();
    }
}
