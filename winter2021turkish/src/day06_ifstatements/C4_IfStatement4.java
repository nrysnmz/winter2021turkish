package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullanicidan gun ismi isteyin
		//girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
 
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gun ismini yaziniz");
		String gunIsmi=scan.next().toLowerCase();
		
		if (gunIsmi.equals("cumartesi")|| gunIsmi.equals("pazar")) {System.out.println("Haftasonu");}
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") 
				|| gunIsmi.equals("persembe") ||gunIsmi.equals("cuma")) {System.out.println("Haftaici");}
		scan.close();
		
	}

}
