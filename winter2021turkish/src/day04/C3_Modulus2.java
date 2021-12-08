package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// Kullanicidan 4 basamakli sayi alalim ve
		// sayinin basamaklarini ters sirada yazdiralim
		
       Scanner scan = new Scanner(System.in);
       System.out.println("Basamaklarini bulmak icin 4 basamakli bir sayi giriniz.");
       int sayi=scan.nextInt();// bu satirdan itibaren elimizde 4 basamakli bir sayi var.
       // 4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz.
       // 1. tekrar
       
       int birlerBas= sayi %10;
       sayi/=10;
       int onlarBasamagi= sayi%10;
       sayi/=10;
       int yuzlerBas=sayi%10;
       sayi/=10;
       int binlerBas=sayi%10;
      
       System.out.println("Birler basamagi:" + birlerBas);
       System.out.println("Onlar basamagi:" + onlarBasamagi);
       System.out.println("Yuzler basamagi:" + yuzlerBas);
       System.out.println("Binler basamagi:" + binlerBas);
      
       System.out.print( birlerBas);
       System.out.print( onlarBasamagi);
       System.out.print(yuzlerBas);
       System.out.println (binlerBas);
       
      
       System.out.println("Yazdiginiz sayinin tersten yazilisi:" +birlerBas+onlarBasamagi+yuzlerBas+binlerBas);
       
       scan.close();
	}

}
