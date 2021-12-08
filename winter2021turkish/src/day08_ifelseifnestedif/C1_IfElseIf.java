package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin.
		//girilen ismi gecerli bir gun ise"Gun"
		//isminin 1. 2. 3. harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin
		//gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini giriniz");
		
		String day=scan.nextLine();
		if( day.equalsIgnoreCase("pazar")|| day.equalsIgnoreCase("pazartesi")) {System.out.println("Paz");
			
			
		} else if(day.equalsIgnoreCase("Sali")){System.out.println("Sal");

		}else if(day.equalsIgnoreCase("carsamba")) {System.out.println("Car");}
		else if(day.equalsIgnoreCase("persembe")) {System.out.println("Per");}
		else if(day.equalsIgnoreCase("cuma")|| (day.equalsIgnoreCase("cumartesi")))  {System.out.println("Cum");}
		else {System.out.println("Lutfen gecerli gun ismi giriniz");
			
		}
		scan.close();

	}

}
