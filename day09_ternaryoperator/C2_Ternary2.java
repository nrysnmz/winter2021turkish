package day09_ternaryoperator;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		int y=1;
		int z=1;
		
		int a=y<10 ? y++ : z++;
		
		
		System.out.println(y+","+z+","+a);
		System.out.println(y++);
		System.out.println(++y);
		System.out.println(y);

	}

}
