// Diameter of a Circle

import java.util.Scanner;

public class _6DiameterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        int radius = sc.nextInt();

        // Diameter formula 2(radius)
        System.out.println("Diameter of circle is "+(2*radius));

        sc.close();
    }
}
