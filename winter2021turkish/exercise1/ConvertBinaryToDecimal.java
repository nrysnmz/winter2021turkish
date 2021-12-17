package exercise1;

import java.util.Scanner;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		
		
		System.out.println("Insert a binary number");
		
		Scanner scan=new Scanner(System.in);
		

		int a= scan.nextInt();
		System.out.println(Integer.toBinaryString(a));
		scan.close();
	}
}
