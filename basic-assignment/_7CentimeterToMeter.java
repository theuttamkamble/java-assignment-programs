// Write a program to enter length in centimeter and convert it into meter.
// (1m=100cm)

import java.util.Scanner;

public class _7CentimeterToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in centimetre:");
        double length = sc.nextDouble();

        //
        System.out.println(length+"cm = "+(length/100)+"m");

        sc.close();
    }
}
