// Write a program to check whether year is leap year or not using conditional operator.

public class _4LeapYear {
    public static void main(String[] args) {
        int year = 1800;
        String result;
      
        result = ((year%4 == 0) && (year%100 != 0 || year%400 == 0)) ? year+" is leap year" : year+" is not leap year";
        System.out.println(result);
    }
}
