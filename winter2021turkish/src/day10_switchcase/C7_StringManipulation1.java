package day10_switchcase;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		// String non-primitive data turlerindendir
		//non-primitive data turleri value ile birlikte methodlara sahiptirler.
		//methodlari kulllanarak String'i degistirmeye String Manipulation denir.
		
		String str="Hello World";
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		
		String str2=str.toUpperCase();
		System.out.println(str);
		System.out.println(str2);		

	}

}
