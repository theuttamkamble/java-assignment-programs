// Write a program to count number of digits in any number.

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 456324;
        int count = 0;

        while(num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println(count);

// Convert integer to string and find length of string
    /*
        String str = String.valueOf(num);
        System.out.println(str.length());
    */
    }
}
