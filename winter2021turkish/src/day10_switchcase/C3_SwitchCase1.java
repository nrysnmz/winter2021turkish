package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan bir rakam isteyin girilen rakami yazi ile yazdirin negatif sayi
		 * ise reddet 9dan buyukse reddet.
		 * 
		 */
		System.out.println("Insert a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num == 1) {
			System.out.println("one");

		} else if (num == 2) {
			System.out.println("two");

		} else if (num == 3) {
			System.out.println("three");

		} else if (num == 4) {
			System.out.println("four");

		} else if (num == 5) {
			System.out.println("five");

		} else if (num == 6) {
			System.out.println("six");

		} else if (num == 7) {
			System.out.println("seven");

		} else if (num == 8) {
			System.out.println("eight");

		}else if (num == 9) {
			System.out.println("nine");}
		else {System.out.println("girilen numara rakam degil");

		}
	
     
	//Soruyu switchcase ile yapiniz

           switch(num) {
           case 0 :
        	   System.out.println("zero");
        	   break;
           case 1 :
        	   System.out.println("one");
        	   break;
           case 2 :
        	   System.out.println("two");
        	   break;
           case 3 :
        	   System.out.println("three");
        	   break;
           case 4 :
        	   System.out.println("four");
        	   break;
        	   
           case 5 :
        	   System.out.println("five");
        	   break;
           case 6 :
        	   System.out.println("six");
        	   break;
           case 7 :
        	   System.out.println("seven");
        	   break;
           case 8 :
        	   System.out.println("eight");
        	   break;
           case 9 :
        	   System.out.println("nine");
        	   break;
        	   default:
        		   System.out.println("Insert a valid an integer");
        	   scan.close();
           }
	}
}
 

