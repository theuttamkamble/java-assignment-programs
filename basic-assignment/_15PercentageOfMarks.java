// Write a program to enter marks of five subjects and calculate total, average and percentage.

import java.util.Scanner;
public class _15PercentageOfMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eng, math, chem, comp, bio;
        float total, avg, percentage;

        System.out.println("Enter marks of english:");
        eng = sc.nextInt();
        System.out.println("Enter marks of math:");
        math = sc.nextInt();
        System.out.println("Enter marks of chem:");
        chem = sc.nextInt();
        System.out.println("Enter marks of comp:");
        comp = sc.nextInt();
        System.out.println("Enter marks for bio:");
        bio = sc.nextInt();

        total = eng + math + chem + comp + bio;
        avg = total / 5;
        percentage = (total / 500) * 100;

        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
        System.out.println("Percentage: "+percentage);

        sc.close();
    }
}
