package day09_ternaryoperator;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		/*Kullanicidan dikdortgenin uzunlugunu ve genisligini alin 
		girilen degerlere gore dikdortgenin kare olup olmadigini
		yazdirin*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Insert the width of the quadrilateral");
		
		double w=scan.nextDouble();
		
		System.out.println("Insert the length of the quadrilateral");
		
		double l=scan.nextDouble();
		String r=(l>=0 && w>0 ? (l==w ? "square" : "not square"): "the value isn't correct");
		
		System.out.println(r);
		
		scan.close();
				

	}

}
