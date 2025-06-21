package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factorial f = new Factorial();
        System.out.println(f.factorial(n));

	}
	
	int factorial(int num) {
		if(num == 0||num == 1) {
			return 1;
		}
		else {
			
			return num*factorial(num-1);
			
	 	}
		
	}

}
