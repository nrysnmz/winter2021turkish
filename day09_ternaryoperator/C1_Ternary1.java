package day09_ternaryoperator;

public class C1_Ternary1 {

	public static void main(String[] args) {


		int num=101;
		String result= (num%2==0) ? "even number" : "odd number";
		
		System.out.println(result);
		
      //ben bir variable'a assign etmek istemezsem
		//o zaman syso icine yazabilirim.
		
		System.out.println(num%2==0 ? "even number" : "odd number");
		
		//basina aciklama yazmak istersem ternary operatoru parantez icine almaliyiz
		
		System.out.println("The result is"+" " +(num%2==0 ? "even number" : "odd number"));
	}

}
