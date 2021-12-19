package day12_stringmanipulation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		
		//indexOf method'u bize istedigimiz karakter(ler)in indexini dondurur.
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6));// g yazdirir
		
		System.out.println("char arama " +str.indexOf('g'));
		
		System.out.println("String arama " + str.indexOf("g"));
		
		System.out.println("String kelime arama " + str.indexOf("is"));
		
		System.out.println("Birden fazla ayni harften varsa " + str.indexOf('i'));
		
		
		System.out.println("Baslangic indexi ile " + str.indexOf('a', 5) );
		
		System.out.println("Olmayan harf " + str.indexOf("dert") );
		
		//Kullanicidan bir cumle isteyin
		//case sensitive olmadan Java kelimesi icerip icermedigini yazdirin.
		
		System.out.println("Lutfen bir cumle yaziniz");
		Scanner scan= new Scanner(System.in);
		String str2 = scan.nextLine().toLowerCase();
		int r=str2.indexOf("java");
		System.out.println(r==-1?"Java icermiyor" :"Java iceriyor")  ;
		
		if (str2.indexOf("java")>=0) {
			System.out.println("Cumle java iceriyor.");
			
		}else {System.out.println("Cumle java icermiyor.");
		
		
	}
}}
