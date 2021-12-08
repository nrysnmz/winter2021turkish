package day07ifelsestatements;

import java.util.Scanner;



public class C8_IfElseIf3 {

	public static void main(String[] args) {
		// Kullanicidan maas icin teklif isteyin
		//Teklif 80000nin uzerinde ise "kabul ediyorum
		//60000-80000 arasi ise "Konusabiliriz"
		//60000nin altinda ise "Maalesef kabul edemem" yazdirin
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Lutfen teklif ettiginiz miktari giriniz");
	    double maas=scan.nextDouble();
	    if (maas>80000) {System.out.println("Kabul ediyorum");
			
		} else if( maas>60000) {System.out.println("Konusabiliriz"); 
			
		}
		else {System.out.println("Maalesef kabul edemem");
	}
	    scan.close(); 
}
}
