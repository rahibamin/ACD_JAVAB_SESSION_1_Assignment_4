// Author Rahib Amin
// Session 1 Assignment 4


import java.util.Scanner;

public class CastingVariables {

	public static void main(String[] args) {

		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Byte Value: ");
		a = sc.nextByte();
		System.out.print("Enter a Short Value: ");
		b = sc.nextShort();
		
	
		System.out.println();
		c = a +b;
		System.out.println("Your INT value is: " + c);
		
		d = c+b;
		System.out.println("Your LONG value is: " + d);
		
		e = c+d;
		System.out.println("Your Float value is: " + e);
		
		f = e+d;
		System.out.println("Your Double value is: " + f);

	}

}
