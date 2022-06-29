// Find Circumference of circle

import java.util.Scanner;

public class _6CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PI = 3.1415f;

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        // Circumference formula
        System.out.println("Circumference of circle is "+(2*PI*radius));

        sc.close();
    }
}
