package test;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
      isPrime(n);
  
		if(isPrime(n)) {
        System.out.print("This is a Prime Number "+n);
        }
        else {
        	System.out.print("This not a Prime Number "+n);
        }
        
	}
	public static boolean isPrime(int num) {
		if(num==0||num==1) {
	return false;
		}
			for(int i = 2;i<num;i++) {
				 if(num%i==0) {
				return false;
				}
			}
		
		return true;
	}

}
