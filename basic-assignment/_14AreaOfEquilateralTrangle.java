// Area of Equilateral trangle

import java.util.Scanner;
public class _14AreaOfEquilateralTrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float area;
        System.out.println("Enter length: ");
        a = sc.nextFloat();

// calculating area
        area =(float) (Math.sqrt(3)/4 * (a * a));
        System.out.println("Area of equilateral trangle is "+area);

        sc.close();
    }
}