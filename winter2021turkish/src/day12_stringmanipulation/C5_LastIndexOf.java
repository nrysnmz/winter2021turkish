package day12_stringmanipulation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin ve uc drurmdan uygun olani yazdirin
		//1.cumle java icermiyor
		//2.cumlede 1 tane java iceriyor
		//3. cumlede birden fazla java var.
		
		System.out.println("Insert a sentence please");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine().toLowerCase();
		int firstJava=str.indexOf("java");
		int lastJava=str.lastIndexOf("java");
		
		if (firstJava==-1) {System.out.println("Cumle java icermiyor");
		
			
		} else if(firstJava==lastJava){System.out.println("Cumlede 1 tane java var");

		}else {System.out.println("Cumlede 1'den fazla java var");}
	}

}
