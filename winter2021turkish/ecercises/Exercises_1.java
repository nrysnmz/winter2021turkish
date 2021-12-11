package ecercises;

import java.util.Scanner;

public class Exercises_1 {
public static void main(String[] args) {
	
	
	System.out.println("Enter a number");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int sq=num*num;
	if (num<10) {System.out.println(sq);
		
	} else if(num>10) {System.out.println(num*2);

	}else {System.out.println(num);
	
} scan.close();
}
}