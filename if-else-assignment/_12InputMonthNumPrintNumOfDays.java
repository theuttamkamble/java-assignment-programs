// Write a program to input month number and print number of days in that month.

import java.util.Scanner;
public class _12InputMonthNumPrintNumOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthnum;

        System.out.println("Enter month number: ");
        monthnum = sc.nextInt();

        if(monthnum == 1 || monthnum == 3 || monthnum == 5 || monthnum == 7 || monthnum == 8 || monthnum == 10 || monthnum == 12 ) {
            System.out.println("31 Days");
        } else if(monthnum == 4 || monthnum == 6 || monthnum == 9 || monthnum == 11) {
            System.out.println("30 Days");
        } else if(monthnum == 2) {
            System.out.println("28/29 Days");
        } else {
            System.out.println("Invalid month number.");
        }

        sc.close();
    }
}
