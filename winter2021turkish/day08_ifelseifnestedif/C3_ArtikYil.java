package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		/*Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
         Kural 1:4 ile bolunemeyen yillar artik yil degildir.
         Kural2:4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400un kati olan
         yillar artik yildir.
	*/

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yil giriniz");
		int year=scan.nextInt();
		
		if (year%4==0 && year%100!=0) {System.out.println("Artik yil");
			}
		else if (year%100==0 && year%400 ==0) {System.out.println("Artik yil");}
		else {System.out.println("Artik yil degil");}
			
		scan.close();
		
}
}