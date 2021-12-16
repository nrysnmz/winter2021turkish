package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		// Concatenation : Java'da toplama(+) islemi yapilirken eger toplanan ifadelerden biri veya 
		//her ikisi String ise Java toplama degil concatenation(BIRLESTIRME) yapar.
		System.out.println(15+20+"Merhaba");
		System.out.println("Merhaba" +15+20);
		System.out.println("Merhaba" +(15+20));
		System.out.println("Merhaba" + 15*20);
		
		
		String str1="Hello";
		String str2="World";
		
		System.out.println(str1+" "+str2);
		
		System.out.println(str1.concat(" ").concat(str2));	
		System.out.println(str1.concat(" "+str2));
	
	}

}
