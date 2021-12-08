package day05;


public class C2_WrapperClass {

	
	public static void main(String[] args) {
		// javada iki tur data turu vardir
		// primitive ve nonprimitive
		//primitive sadece value icerir
		//non-primitive data turleri ise deger ve methodlari icerir
		
		String isim= "mehmet";
		System.out.println(isim.toUpperCase() );
		
		// byte sayi=10;
		Byte sayi2=11;
		System.out.println(sayi2);
		Byte byteMinSayi = Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		Byte byteMaxSayi=Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
	
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
	    System.out.println(Integer.MIN_VALUE);
	    System.out.println(Integer.MAX_VALUE);
	  
	
	}

}
