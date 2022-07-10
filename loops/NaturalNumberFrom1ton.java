// Write a program to print all natural numbers from 1 to n. - using while loop

import java.util.Scanner;
public class NaturalNumberFrom1ton {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nnumber: ");
        num = sc.nextInt();

        int i = 1;
        while(i<=num) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
