// Write a program to check whether a number is negative, positive or zero.

import java.util.Scanner;
public class _3CheckNumberPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter number:");
        num = sc.nextInt();

        if(num > 0) {
            System.out.println(num+" is positive number.");
        } else if(num < 0) {
            System.out.println(num+" is negative number.");
        } else {
            System.out.println(num+" is zero.");
        }
        sc.close();
    }
}
