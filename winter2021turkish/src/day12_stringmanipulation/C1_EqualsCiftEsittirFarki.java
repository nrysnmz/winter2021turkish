package day12_stringmanipulation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		String str1= "Ali Can";

		String str2=str1 + "";
		
		System.out.println(str1==str2);//false cikar
		System.out.println(str1.equals(str2));//true cikar
		
		
		String str3=str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		
		
	}

}
