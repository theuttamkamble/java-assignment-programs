// Write a program to enter temperature in Fahrenheit and convert to Celsius.
// (celsius = (fahrenheit - 32) * 5 / 9)

import java.util.Scanner;
public class _9FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Enter temperature in fahrenheit:");
        fahrenheit = sc.nextDouble();

        // converting fahrenheit to celsius.
        celsius = ((fahrenheit-32)*5/9);

        System.out.println(fahrenheit+"f = "+celsius+"c");

        sc.close();
    }
}
