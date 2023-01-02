// Write a program to enter length in Centimeter and convert it into Kilometre.
// (1m=100000cm)

import java.util.Scanner;
public class _7CentimeterToKiloMetre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in Centimeter");
        float length = sc.nextFloat();

        // conversion of centimeter to kilometre
        System.out.println(length+"cm = "+(length/100000)+"km");

        sc.close();
    }
}
