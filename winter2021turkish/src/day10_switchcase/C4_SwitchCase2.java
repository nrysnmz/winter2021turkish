package day10_switchcase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		// Kullanicidan kacinci ayda oldugunu alin ve sayi olarak girilen ay'in ismini yazdirin.

		System.out.println("Insert the month you are in.");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
			default:
				System.out.println("Insert a valid number for the right month");
		}scan.close();

	}
}