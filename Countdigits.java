package test;

public class Countdigits {

	public static void main(String[] args) {
		int num = 123455732;
System.out.println(CountDigits(num));
	}
 public static int CountDigits(int n) {
	 if(n==0) return 0;
	 
	return 1+CountDigits(n/10);
	 
 }
}
