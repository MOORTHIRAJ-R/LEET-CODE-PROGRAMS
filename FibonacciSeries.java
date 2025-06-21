package test;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num =10;
		Fibonacci(num);
	}
 public static int Fibonacci(int n) {
	 int a=0,b=1,temp;
	 System.out.print(a+" ");
	 System.out.print(b+" ");
	 for(int i=2;i<n;i++) {
		 temp=a+b;
	 System.out.print(temp+" ");
	 a=b;
	 b=temp; 
	 }
	
	 
	return n;
 }
}
