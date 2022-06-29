import java.util.Scanner;

public class _1InputOutput {
	public static void main(String[] arg) {
		byte b;
		short s;
		char c;
		int i;
		long l;
		float f;
		double d;
		
		Scanner sc = new Scanner(System.in);
		
		// input value for byte 128
		System.out.println("Enter byte value: ");
		b = sc.nextByte();
		System.out.println("Entered byte value: "+b);
		
		// input value for short 32767
		System.out.println("Enter short value: ");
		s = sc.nextShort();
		System.out.println("Entered short value: "+s);
		
		//flush or clear scanner onject before take an input as char/string
		sc.nextLine();

		// // input value for char
		System.out.println("Enter char value: ");
		c = sc.nextLine().charAt(0);
		System.out.println("Entered char value: "+c);
		
		// input value for int
		System.out.println("Enter int value: ");
		i = sc.nextInt();
		System.out.println("Entered int value: "+i);

		// input value for long
		System.out.println("Enter long value: ");
		l = sc.nextLong();
		System.out.println("Entered long value: "+l);
		
		// input value for float
		System.out.println("Enter float value: ");
		f = sc.nextFloat();
		System.out.println("Entered float value: "+f);
		
		// input value for double
		System.out.println("Enter double value: ");
		d = sc.nextDouble();
		System.out.println("Entered double value: "+d);
		
		sc.close();
	}
}
