// Write a program to enter two numbers and find their sum.

import java.util.Scanner;

public class _2SumOfTwoNum {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number:");
        num1 = sc.nextInt();

        System.out.println("Enter Second number:");
        num2 = sc.nextInt();

        // Adding num1 and num2
        result = num1+num2;

        System.out.println(num1+" + "+num2+" = "+result);
        sc.close();
    }
}
