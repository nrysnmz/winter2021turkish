package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		/* Kullanicidan bir sayi alin
		sayi cift ise "cift" yazdirin degilse sayinin karesini yazdirin.*/
		
		System.out.println("Insert an integer number");
		
		Scanner scan= new Scanner(System.in);
		
		int num= scan.nextInt();
		System.out.println(num%2==0?"Cift sayi":num*num);
		
		
		scan.close();		

	}

}
