package day07ifelsestatements;

import java.util.Scanner;

public class C4_IfElse4 {

	public static void main(String[] args) {
		// Kullanicidan ucgenin kenar uzunluklarini alin
		//uc kenar esitse eskenar yazdirin 
		//yoksa eskenar degil yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		double k1=scan.nextDouble();
		double k2=scan.nextDouble();
		double k3=scan.nextDouble();
		
		if (k1==k2 && k2==k3 ) {System.out.println("Eskenar");}
		else {System.out.println("Eskenar degil");}
	scan.close();
	}

}
