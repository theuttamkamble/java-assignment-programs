// Write a program to enter two angles of a triangle and find the third angle.

import java.util.Scanner;
public class _12FindThirdAngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstangle;
        float secondangle;
        float thirdangle;

        System.out.println("Enter first angle:");
        firstangle = sc.nextFloat();

        // angle size must be under 180
        if(firstangle >= 179) {
            System.out.println("invalid angle size!");
            System.exit(0);
        }

        System.out.println("Enter second angle:");
        secondangle = sc.nextFloat();

        // addition of two angles is under 179
        // because total of 3 angles are 180
        if(secondangle + firstangle >= 180) {
            System.out.println("You entered wrong angle size!");
            System.exit(0);
        }
        
        // finding third angle
        thirdangle = 180 - (firstangle + secondangle);
        System.out.println("Third angle size is "+thirdangle);
        
        sc.close();
    }
}
