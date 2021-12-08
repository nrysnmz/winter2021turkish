package day07ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIF2 {
   public static void main (String[]args) {
	 //Kullanicidan iki sayi isteyin
	   //sayilarin ikisi de pozitif ise sayilarin toplamini
	   //yazdirin, sayilarin ikisi de negatif ise sayilarin carpimini yazdirin
	   //sayilarin ikisi farkli isaretlere sahipse farkli isaretlerde islem yapamazsin yazdirin
	   //sayilardan sifira esit olan varsa sifir carpmaya gore yutan elemandir yazdirin
	   
	   Scanner scan= new Scanner(System.in);
	   
	   System.out.println("Lutfen iki sayi yaziniz");
	   double sayi1=scan.nextDouble();
	   double sayi2=scan.nextDouble();
	   if (sayi1==0 ||sayi2==0) {System.out.println("Sifir carpmada yutan elemandir.");
		
	} else if(sayi1>0 && sayi2>0) {
		System.out.println("Sayilarin toplami: +(sayi1+sayi2)");
		}else if(sayi1<0 && sayi2<0) {
			System.out.println("Sayilarin carpimi: + sayi1*sayi2");
		}else {
		System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
	}
   scan.close();
   }
}
	   

