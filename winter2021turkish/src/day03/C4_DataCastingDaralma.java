package day03;



public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		double numDouble =400.56;
		
		int numInt =(int) numDouble;
		
		System.out.println("Integer degisken degeri: "+ numInt);
		
		byte numByte=(byte) numInt;
		
		System.out.println("Byte degisken degeri: "+ numByte);
		
		int numInti = 256;
		System.out.println("Integer degisken degerri:" + numInti);
		
		short numShort = (short) numInti;
		System.out.println("Short degisken degeri:" + numShort);
		
		byte numByt = (byte) numShort;
		System.out.println("Byte degisken degeri" + numByt);
		
		float sayi = 856.89f;
		System.out.println("float:" + sayi);
		
		double sayisi = 255.36;
		System.out.println("Double:" + sayisi);
		
        int numInter = (int) sayisi;
        System.out.println("integer:" + sayisi);
        
        //byte sayiByt = (byte) numInter;
        System.out.println("byte:" + numInter);
        
        int numInt1 = 110;
        		int numInt2 = 20;
        		System.out.println(numInt1/numInt2);
				

	}

}
