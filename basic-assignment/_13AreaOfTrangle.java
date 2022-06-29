// Write a program to enter base and height of a triangle and find its area.

import java.util.Scanner;
public class _13AreaOfTrangle {
    public static void main(String[] args) {
        int base;
        int height;
        float area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base:");
        base = sc.nextInt();

        System.out.println("Enter height:");
        height = sc.nextInt();

        // area of trangle 
        area = (base*height)/2;
        System.out.println("Area of trangle is "+area);

        sc.close();
    }
}