// Write a program to calculate product of digits of any number.

public class CalculateProductOfDigits {
    public static void main(String[] args) {
        int num = 58748;
        int prod = 1;

        while(num != 0) {
            int rem = num % 10;
            prod = prod * rem;
            num /= 10;
        }

        System.out.println("Product of digits: "+prod);
    }
}
