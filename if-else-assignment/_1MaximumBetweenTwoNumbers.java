// Write a program to find maximum between two numbers.

import java.util.Scanner;
public class _1MaximumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("First number is bigger - "+num1);
        } else {
            System.out.println("Second number is bigger - "+num2);
        }

        sc.close();
    }
}