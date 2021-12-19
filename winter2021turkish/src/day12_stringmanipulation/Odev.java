package day12_stringmanipulation;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve harf isteyin harfin cumle icinde var olup olmadigini yazdirin
		
		System.out.println("Insert a sentence please");
		System.out.println("Insert a letter please");
		Scanner scan= new Scanner(System.in);
		String sen=scan.nextLine().toLowerCase();
		CharSequence let=scan.next().toLowerCase();
		if (sen.contains(let)) {System.out.println("The sentence includes " + let);
			
		} else {System.out.println("The sentence does not include it");

		}
		
	
	scan.close();


}
}


