package exercise1;

import java.util.Scanner;

public class ConvertDecimaltoBinary {

	public static void main(String[] args) {
		
		System.out.println("Insert an integer");
		
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt(); 
		System.out.println(Integer.toBinaryString(num));
		
		
		scan.close();

	}

}
