package day03;

import java.util.Scanner;


public class C1_Scanner1 {

	public static void main(String[] args) {
		
          
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen sadece isminizi giriniz");
		
		String name = scan.nextLine();
		
		System.out.println("Lutfen sadece soyisminizi giriniz");
		
		String surname = scan.nextLine();
		
		System.out.println("Isminiz: " + name);
		System.out.println("Soyisminiz:" + surname);
	    System.out.println("Kursumuza kaydiniz alinmistir, tesekkur ederiz. ");
	    scan.close();
	    }

}
