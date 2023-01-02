// Write a program to enter any number and calculate its square root.

import java.util.Scanner;
public class _11SquareRootWithFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Enter number for square root:");
        num = sc.nextInt();

        System.out.println("Square root of "+num+" is "+ Math.sqrt(num));
         
        sc.close();
    }
}
