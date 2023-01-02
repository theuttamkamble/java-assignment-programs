import java.util.Scanner;

public class _6AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float IP = 3.1415f;
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        // Area formula
        System.out.println("Area of circle is "+(IP*radius*radius));
        
        sc.close();
    }
}
