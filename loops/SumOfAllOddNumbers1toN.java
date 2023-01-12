// Write a program to find sum of all odd numbers between 1 to n.

import java.util.Scanner;
public class SumOfAllOddNumbers1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");;
        num = sc.nextInt();

        int sum = 0;
        
        int i = 1;
        while(i <= num) {
            if(i%2 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
        sc.close();
    }
}
