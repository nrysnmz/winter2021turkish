package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatements3 {

	public static void main(String[] args) {
		//kullanicidan gun isminin ilk harfini isteyin ve 
		//harfe uygun olan gun isimlerini yazdirin
		
      
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen gun isminin ilk harfini yaziniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='p' || ilkHarf=='P') {System.out.println("Pazar, Pazartesi veya Persembe");
	}
	     if(ilkHarf=='s' ||ilkHarf=='S')  {System.out.println("Sali");}
	     
	     if(ilkHarf=='c' ||ilkHarf=='C')  {System.out.println("Carsamba,Cuma veya Cumartesi");}
	
	     if(ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C') 
	     {System.out.println("Lutfen gecerli bir harf yaziniz");}
	     scan.close(); 
	}
	      
}
