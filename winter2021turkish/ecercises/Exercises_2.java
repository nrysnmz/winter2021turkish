package ecercises;

import java.util.Scanner;

public class Exercises_2 {

	public static void main(String[] args) {


		System.out.println("Please enter the radius");
		Scanner scan=new Scanner(System.in);

		double rad=scan.nextDouble();
		System.out.println(Math.PI);
		double area=Math.PI*rad*rad;
		double p=2*Math.PI*rad;
		System.out.println("Area="+area);
		System.out.println("Perimeter="+p);
		
		
				
	}

}
