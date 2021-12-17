package exercise1;

public class Return {

	public static void main(String[] args) {
	System.out.println(parrotTrouble(false,6));

	}
	public static boolean parrotTrouble(boolean talking ,int hour) {
		
		return(talking&&(hour<7 ||hour>20));
		

}
}
