package day09_ternaryoperator;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		//Kullanicidan iki sayi alin ve buyuk olani sayiyi yazdirin
		
		System.out.println("Insert a number");
		Scanner scan= new Scanner(System.in);
		double a=scan.nextDouble();
		System.out.println("Insert another number");
		double b=scan.nextDouble();
		double result=a>=b ? a:b ;
		
		System.out.println(result);
	
		scan.close();
		

	}
}


     
