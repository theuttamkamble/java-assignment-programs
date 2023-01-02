// Write a program to enter two numbers and perform all arithmetic operations.

import java.util.Scanner;

public class _3ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        // Addition (+)
        System.out.println(num1+" + "+num2+" = "+(num1+num2));

        // Subtraction
        System.out.println(num1+" - "+num2+" = "+(num1-num2));

        // Multiplication
        System.out.println(num1+" * "+num2+" = "+(num1*num2));

        // Division
        System.out.println(num1+" / "+num2+" = "+(num1/num2));

        // Modulo / Reminder
        System.out.println(num1+" % "+num2+" = "+(num1%num2));

        sc.close();
    }
}