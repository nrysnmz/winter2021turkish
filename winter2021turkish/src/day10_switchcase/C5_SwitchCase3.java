package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		//Kullanicidan hangi gunde oldugumuzu isteyin(Yaziyla)
		//girilen gunun hafta ici veya hafta sonu oldugunu yazdirin.
		
		System.out.println("Insert the name of the day");
		Scanner scan=new Scanner(System.in);
		String day=scan.next().toLowerCase();
		
		switch (day) {
		
		case "monday": 
		case "tuesday": 
		case "wednesday":
		case "thursday": 
		case "friday": 
			System.out.println("Weekday");
			break;
		case "saturday": 
		case "sunday":
			System.out.println("Weekend");
			break;
			default:
				System.out.println("Insert a valid day");
				
	
		scan.close();}
		

	}

}
