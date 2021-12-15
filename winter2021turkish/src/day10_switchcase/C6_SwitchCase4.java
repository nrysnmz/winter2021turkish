package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// Kullanicidan VIP kisaltmasinda hangi harfin anlamini istedigini soralim
		// girilen harfin aciklamasini yazdirin.
		System.out.println("Choose one of the letters from  VIP to get its meaning");
		Scanner scan = new Scanner(System.in);

		char letter = scan.next().toLowerCase().charAt(0);

		switch (letter) {
		case 'v':
			System.out.println("Very");
			break;
		case 'i':
			System.out.println("Important");
			break;
		case 'p':
			System.out.println("Person");
			break;
		default: {
			System.out.println("Invalid letter");
	

      //Kullanicinin sadece bir harf girmesini istiyorsak

	
	String str = scan.next().toLowerCase();

	switch(str)
	{
      case "v":
	System.out.println("Very");
	break;
    case "i":
	System.out.println("Important");
	break;
    case "p":
	System.out.println("Person");
	break;
	default:
	{System.out.println("Invalid letter");}
	
	scan.close();}
		}
		}
	}

}



		
		
