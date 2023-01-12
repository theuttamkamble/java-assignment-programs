// Write a program to calculate sum of digits of any number.

public class SumOfDigitsOfAnyNumber {
    public static void main(String[] args) {
        int num = 648238;
        int sum = 0;

        while(num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("Sum of all digits: "+sum);
    }
}
