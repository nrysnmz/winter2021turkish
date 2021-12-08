package day07ifelsestatements;

import java.util.Scanner;

public class C2_IfElse {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini alin
		//uzunluklar esit ise kare, degilse kare degil yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		 
		if (kenar1==kenar2) {System.out.println("kare");}
		else {System.out.println("kare degil");
	}
	scan.close();}
}
