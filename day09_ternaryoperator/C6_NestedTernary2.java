package day09_ternaryoperator;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		/*Kullanicidan bir harf isteyin kucuk harf ise consola "Kucuk Harf" ,
		buyuk harf ise "Buyuk Harf" 
		yoksa "Girdiginiz karakter harf degil" yazdirin.*/
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Insert a letter");
		char a=scan.next().charAt(0);
		String r= (a>='a'&& a<='z') ? "Kucuk Harf": (a>='A' && a<='Z')?"Buyuk Harf" :"Girdiginiz karakter harf degil";
	
		System.out.println(r);
		
		

	}

}
