package day07ifelsestatements;

import java.util.Scanner;

public class C3_IfElse3 {

	public static void main(String[] args) {
		//Kullanicidan yasini sorun
		//yas 65 veya buyukse 'emekli olabilirsin' yoksa 'emekli olamazsin' yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		if (yas>=65) {System.out.println("Emekli olabilirsiniz");}
		else {System.out.println("Emekli olamazsiniz");}
		scan.close();
		
		}
		

	}


