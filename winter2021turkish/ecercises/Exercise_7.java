package ecercises;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		System.out.println("Insert a degree in Fahreneit ");
		Scanner scan=new Scanner(System.in);
		double f=scan.nextDouble();
		double c=(f-32)*5.0/9.0;
		System.out.println("Celsius="+c);

	}

}
