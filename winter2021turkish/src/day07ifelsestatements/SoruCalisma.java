package day07ifelsestatements;

import java.util.Scanner;

public class SoruCalisma {//Sayi tek mi cift mi(kullanicidan alinan)//

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Kontrol edilecek sayiyi giriniz");
		int x=scan.nextInt();
    	if (x%2==0) {
		System.out.println("Sayiniz cift sayidir");}
		else {System.out.println("Sayiniz tek sayidir");}
		scan.close();
		 

	}

}
