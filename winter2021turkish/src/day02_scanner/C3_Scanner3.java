package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("lutfen isminizi giriniz");
		
		String name =scan.nextLine();
		
		System.out.println("lutfen soyisminizi giriniz");
		
		String surname =scan.nextLine();
		
		System.out.println(name+" "+surname);
		scan.close();
	}

}
