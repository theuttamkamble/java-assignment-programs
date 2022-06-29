// Write a program to convert days into years, weeks and days.
// 	years = (days / 365);   // Ignoring leap year
//	weeks = (days % 365) / 7;
//	days  = days - ((years * 365) + (weeks * 7));

import java.util.Scanner;
public class _10ConvertDaysIntoYearsWeeksDays {
    public static void main(String[] args) {
        int days;
        int years;
        int weeks;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Days:");
        days = sc.nextInt();

        years = days/365;
        weeks = (days % 365) / 7;
        days = (days % 365) % 7;

		System.out.println(((days % 365) % 7));
		System.out.println("Years: "+years+" | Weeks: "+weeks+" | days: "+days);
			
		sc.close();
    }
}
