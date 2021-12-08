package day07ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin
		// sayi pozitif ise sayi pozitif yazdirin
		//sayi 100den kucuk ise  kucuk sayi yazdirin
		//sayi 1000den buyuk ise  buyuk sayi yazdirin

		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int tamsayi=scan.nextInt();
		
		if (tamsayi>0 ) {System.out.println("sayi pozitif");}
		
		if(tamsayi>1000) {System.out.println("buyuk sayi");}
		
		if(tamsayi<100) {System.out.println("kucuk sayi");}
		
		if(tamsayi<0) {System.out.println("Lutfen ");
	}
	scan.close();
	}
}
