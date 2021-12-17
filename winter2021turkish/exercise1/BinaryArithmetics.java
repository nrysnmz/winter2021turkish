package exercise1;

import java.util.Scanner;

public class BinaryArithmetics {

	public static void main(String[] args) {

		String b1, b2;
		
		int i1,i2;
		

		System.out.println("Enter first binary number");
		Scanner scan = new Scanner(System.in);

		b1=scan.next();
		System.out.println("Enter second binary number");
		b2=scan.next();
		//first convert binary to decimal
		i1=Integer.parseInt(b1,2);
		i2=Integer.parseInt(b2,2);
		System.out.println("Product is " + Integer.toBinaryString(i1*i2));
		System.out.println("Sum is " + Integer.toBinaryString(i1+i2) );
		System.out.println("Difference is " + Integer.toBinaryString(i1-i2));
		System.out.println("Quotient is " + Integer.toBinaryString(i1/i2));
		
		scan.close();

	}

}
