// Write a program to find maximum between three numbers using conditional operator.

public class _2MaximumBetweenThreeNum {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int c = 25;
        int result;

        result = (a>b && a>c) ? a : b>c ? b : c;
        System.out.println(result);
    }
}
