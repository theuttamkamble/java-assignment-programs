// Write a program to find maximum between three numbers.

import java.util.Scanner;

public class _2MaximumBetweenThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        System.out.println("Enter third number:");
        num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1+" is bigger number.");
        } else if(num2 > num3) {
            System.out.println(num2+" is bigger number.");
        } else {
            System.out.println(num3+" is bigger number.");
        }

        sc.close();
    }
}