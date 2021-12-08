package day04;

public class C2_ModulusOperator {

	public static void main(String[] args) {
	
		int kalan=15% 4;
		System.out.println(kalan);
       
		System.out.println(26%8);
		int sayi=856;
		int birlerBasamagi = 856%10;
		System.out.println(birlerBasamagi);
		sayi/=10;
        System.out.println(sayi);
        int onlarBasamagi=sayi%10;
        System.out.println(onlarBasamagi);
        sayi/=10;
       
        System.out.println(sayi);
        int yuzlerBasamagi= sayi;
        System.out.println(yuzlerBasamagi);
	}

}
