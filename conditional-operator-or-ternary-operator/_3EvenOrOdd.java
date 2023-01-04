import java.util.Scanner;

// Write a program to check whether a number is even or odd using conditional operator.

public class _3EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        int num = new Scanner(System.in).nextInt();
        String result;
        
        result = (num%2==0) ? num+" is even" : num+" is odd";
        System.out.println(result);
    }
}
