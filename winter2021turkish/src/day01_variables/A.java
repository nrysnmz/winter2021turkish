package day01_variables;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a>90&&a<100){
            System.out.println("A");
        }

        if(a>80&&a<90){
            System.out.println("B");
        }

        if(a>70&&a<80){
            System.out.println("C");
        }

	}

}
