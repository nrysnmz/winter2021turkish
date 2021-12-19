package day12_stringmanipulation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// Kullanicidah bir String girmesini isteyin girilen 
		//String'in son harfini Buyuk harf olarak yazdirin.
		
		System.out.println("Insert a sentence");
		
		Scanner scan= new Scanner(System.in);
		
		String str = scan.nextLine().toUpperCase();
		
		System.out.println("The last letter of your sentence is " +str.charAt(str.length()-1));
		System.out.println(str);
		
		
		String str2="";
		System.out.println(str2.length());

		String str3= null;//turkcede null hic demek
		                  //normalde stringler "" icine yazilir ama null icin buna gerek yoktur.
		System.out.println(str3.length());//Run Time Error(RTE) verir
		
		scan.close();
	}


}
