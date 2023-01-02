// 4. Write a program to enter length and breadth of a rectangle and find its perimeter. 
// (perimeter of rectangle = 2 * length + width)

import java.util.Scanner;

public class _4RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length;
        int width;

        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter width:");
        width = sc.nextInt();

        // perimeter of rectangle
        System.out.println("Perimeter of rectangle is "+(2*(length+width)));

        sc.close();
    }
}
