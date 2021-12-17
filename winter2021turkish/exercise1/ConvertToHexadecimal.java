package exercise1;

import java.util.Scanner;

public class ConvertToHexadecimal {

	public static void main(String[] args) {


		System.out.println("Insert a decimal number");
		
		Scanner scan= new Scanner(System.in);
		
		int a= scan.nextInt();
		System.out.println(Integer.toHexString(a));

		scan.close();
	}

}
