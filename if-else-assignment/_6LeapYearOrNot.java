// 6.   Write aprogram to check whether a year is leap year or not.

import java.util.Scanner;;
public class _6LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Enter Year: ");
        year = sc.nextInt();

        // if(((year%4==0) && ((year%400==0) || (year%100!==0))  {

        // }
        if((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
            System.out.println("Year " +year+" is Leap Year.");
        } else {
            System.out.println("Year " +year+" is not Leap Year!");
        }

        sc.close();
    }
}
