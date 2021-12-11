package ecercises;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input first number");
		int a=scan.nextInt();
		System.out.println("Input second number");
		int b=scan.nextInt();
		System.out.println("Input third number");
		int c=scan.nextInt();
		int av=(a+b+c)/3;
		System.out.println("Avarage="+av);
		
		
	}

}