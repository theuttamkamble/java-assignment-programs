import java.util.Scanner;

// Write a program to find sum of all natural numbers between 1 to n.

public class SumOfAllNaturalNumbers1toN {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= num) {
            sum+=i;    
            i++;
        }

        System.out.println(sum);

        sc.close();
    }
}
