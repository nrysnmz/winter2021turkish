package day09_ternaryoperator;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		
		//Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Insert one integer");
		int a=scan.nextInt();
		
		String result=a%2==0 ? "even number" : "odd number";
		
		System.out.println(result);
		
		// girilen sayinin mutlak degerini yazdiriniz
		//5 ise 5   -12 ise 12(girilen sayi X olsun.X pozitif is |X|=X negatifse |X|=-X
		
		
		
		System.out.println(("Sayinin mutlak degeri(absolute value) :") + (a>0 ? a:-a));
             
		scan.close();
	}

}
