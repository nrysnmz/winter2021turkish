package day08_ifelseifnestedif;

import java.util.Scanner;

public class C2_NestedIf {

	public static void main(String[] args) {
		/*Verilen degerlere gore
		 * Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		 * calisan erkekse 65 yasindabn buyukse emekli olabilir
		 */

		String gender="kadin";
		 int age= 59;
		 if(age<0)	{System.out.println("Yas negatif olamaz");}	
		 else if(gender.equalsIgnoreCase("erkek") && age>65) {System.out.println("Emekli olabilirsin");}
         else if (gender.equalsIgnoreCase("erkek")&& age<65) {System.out.println("Emekli olamazsin");}
        else if  (gender.equalsIgnoreCase("kadin") && age>60) {System.out.println("Emekli olabilirsin");}
        else if (gender.equalsIgnoreCase("kadin") && age<60) {System.out.println("Emekli olamazsin");}
        		
         else {System.out.println("Cinsiyet veya yas tanimsiz");}
		 
		 System.out.println("Nested if ile sonuc");
		 
		 if (gender.equalsIgnoreCase("erkek")) {
			 if (age<0) {System.out.println("yas negatif olamaz");
				
			} else if(age<65){System.out.println("Bu yastaki erkek emekli olamaz");

			}else {System.out.println("Bu yastaki erkek emekli olabilir");}
			 
			
		} else if(gender.equalsIgnoreCase("kadin")){
			if (age<0) {System.out.println("Kadin yas negatif olamaz");
				
			} else if(age<60) {System.out.println("Bu yastaki kadin emekli olamaz");

			}else {System.out.println("Bu yastaki kadin emekli olabilir");}

		}else {
			System.out.println("Yazdiginiz cinsiyet sisteme kayitli degil");
		}
       
}
}