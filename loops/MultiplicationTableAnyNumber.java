// Write a program to print multiplication table of any number.

import java.util.Scanner;
public class MultiplicationTableAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number for table:");
        num = sc.nextInt();

        int i=1;
        while(i<=10) {
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }

        sc.close();
    }
}
