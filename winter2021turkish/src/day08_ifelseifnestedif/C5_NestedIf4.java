package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		/*Kullanicidan bir sifre isteyin
		 Eger ilk harf buyuk ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli sifre degilse 
		 "Gecersiz sifre" yazdirin.
		 Eger ilk harf kucuk ise "z" olup olmadigini kontrol edin.Ilk harf  ise"Gecerli sifre degilse 
		 "Gecersiz sifre" yazdirin.
		 */
       
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen sifrenizi giriniz");
		
		char ilkHarf =scan.next().charAt(0);
		if (ilkHarf>='A' && ilkHarf<='Z') {
			if (ilkHarf=='A') {System.out.println("Gecerli sifre");
				
			} else {System.out.println("Gecersiz sifre buyuk harf");

			}
		 
		}else if (ilkHarf>='a' && ilkHarf<='z') {
			if(ilkHarf=='z'){System.out.println("Gecerli sifre");
		}   else {System.out.println("Gecersiz sifre kucuk harf");
		}
			
		} else {System.out.println("Sifre gecersiz lutfen ilk karakteri harf yapiniz");}
		scan.close();
		}
	}
		
		

		
		
		


