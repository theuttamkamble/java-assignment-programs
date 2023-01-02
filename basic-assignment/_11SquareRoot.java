// Write a program to enter any number and calculate its square root.

import java.util.Scanner;
public class _11SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        float temp, sqrt;
        
        System.out.println("Enter number for square root:");
        num = sc.nextInt();

        sqrt = num/2;
        temp = 0;

        while(sqrt != temp) {
            temp = sqrt;
            sqrt = (num / temp + temp) / 2;
        }
        System.out.println("Square root of "+num+" is "+ sqrt);
         
        sc.close();
    }
}
