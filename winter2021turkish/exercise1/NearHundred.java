package exercise1;

public class NearHundred {
public static void main(String[] args) {
	System.out.println(nearHundred(89));
}
       public static boolean nearHundred(int n ){
    	   int value1=100-n;
    	   int value2=200-n;
    	   return (Math.abs(value1)<=10 || (Math.abs(value2)<=10));
       }
}
