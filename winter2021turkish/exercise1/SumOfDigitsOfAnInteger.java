package exercise1;

import java.util.Scanner;

public class SumOfDigitsOfAnInteger {

	public static void main(String[] args) {


		System.out.println("Insert an integer");
		Scanner scan = new Scanner(System.in);
		
		int a= scan.nextInt();
		int sum= String.valueOf(a).chars().map(Character::getNumericValue).sum();
		System.out.println(sum);
		
        scan.close();
	}

}
