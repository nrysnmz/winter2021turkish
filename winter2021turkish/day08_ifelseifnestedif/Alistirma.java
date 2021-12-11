package day08_ifelseifnestedif;

import java.util.Scanner;

public class Alistirma {

	public static void main(String[] args) {
		/*Kullanicidan 4 basamakli bir sayi girmesini isteyin
		 * 5'e bolunuyorsa son rakami kontrol edin son rakami 0 ise 5'e
		 * bolunen cift sayi
		 * 5'e bolunen tek sayi ise 5'e bolunen tek sayi yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort basamakli sayi giriniz");
		int sayi=scan.nextInt();
         if(sayi<1000 &&sayi>10000) {System.out.println("Lutfen gecerli bir sayi giriniz");}
         
         if (sayi%2==0) {
        	 if(sayi%5==0) {System.out.println("5'e bolunen cift sayi");
         }
			
		} else {
			if(sayi%2==1) {
				if(sayi%5==0) {System.out.println("5'e bolunen tek sayi");
			}else {System.out.println("Sayi 5'e bolunemez");
			}scan.close();
			}
		}
	}
}

		
		
   
	

