// Write a C program to enter any number and print its reverse.

import java.util.Scanner;;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();

        int revnum = revNumber(num);
        System.out.println(revnum);
    }

    public static int revNumber(int num) {
        int rev = 0;
        while(num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }

        return rev;

    }
}
