package day07ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerindeb notunu isteyin.Notu harf sistemine cevirip yazdirin
		//50'den kucukse D, 50-60 arasi C,60-80 arasi B, 80 uzeri ise A
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen notunuzu sayi olarak giriniz");
 
		double not= scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lutfen gecerli bir not giriniz");
			
		} else if (not<50){System.out.println("Notunuz: D");}
		else if( not<60) {System.out.println("Notunuz: C");}
		else if(not<80) {System.out.println("Notunuz B");
		} 
		else {System.out.println("Notunuz: A");}
		scan.close();
		}
	}


