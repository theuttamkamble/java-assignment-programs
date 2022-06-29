// Write a program to check whether a number is even or odd.

import java.util.Scanner;
public class _5EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num+" is even number.");
        } else {
            System.out.println(num+" is odd number.");
        }

        sc.close();
    }
}
