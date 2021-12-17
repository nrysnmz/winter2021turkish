package exercise1;

public class Difference {
public static void main(String[] args) {
	System.out.println(diff21(50));
}

public static int diff21(int n) {

	if (n <= 21) {
		return 21 - n;
	}
	return (n - 2) * 2;
}
}
