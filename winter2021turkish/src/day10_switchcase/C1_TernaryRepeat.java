package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryRepeat {

	public static void main(String[] args) {
		
		/* Kullanicidan bir sayi alin ve sayi 3  basamakli pozitif ise "uc basamakli sayi"
		yoksa "Uc basamakli degil" yazdirin*/
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Insert an integer number");
		int num= scan.nextInt();
		String res=num>99? (num<1000?"uc basamakli":"uc basamakli degil"):"uc basamakli sayi degil";
			System.out.println(res);
		//nested ternary olmasin(cevap altta)
			
		String r= num>99 && num<1000 ||num<-99 && num>-1000 ?"Uc basamakli" :"Uc basamakli degil";
		System.out.println(r);
			

		scan.close();
	}

}
