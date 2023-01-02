// Write a program to enter temperature in Celsius and convert it into Fahrenheit.
// (fahrenheit = (celsius * 9 / 5) + 32)

import java.util.Scanner;
public class _8CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temprature in Celsius:");
        celsius = sc.nextDouble();

        // converting celsius to farhinhite ((celsius * 9/5)+32)
        fahrenheit = ((celsius * 9/5)+32);
        System.out.println(celsius+"c = "+fahrenheit+"f");

        sc.close();
    }
}
