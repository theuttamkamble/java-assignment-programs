// Write a program to enter P, T, R and calculate Simple Interest.

import java.util.Scanner;
public class _16CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float p, r, t, si;

        System.out.println("Enter principle amount: ");
        p = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        r = sc.nextInt();
        System.out.println("Enter time: ");
        t = sc.nextFloat();

        si = (p * r * t) / 100;
        System.out.println("Simple interest is "+si);

        sc.close();
    }
}
