// 5. Write a program to enter length and breadth of a rectangle and find its area.
// (area = length * breadth)

import java.util.Scanner;

public class _5AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        int breadth;

        System.out.println("Enter lenght:");
        length = sc.nextInt();
        System.out.println("Enter breadth:");
        breadth = sc.nextInt();

        // Area of rectangle.
        System.out.println("Area of Rectangle is "+(length*breadth));

        sc.close();
    }
}
