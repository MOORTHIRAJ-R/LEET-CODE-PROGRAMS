package test;
import java.util.Scanner;

public class RiverseStringCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String Str = sc.nextLine();
             String res="";
             int count = 1;
         for(int i =0 ;i<Str.length();i++) {
        	 if(count==1) {
        		 res+=Str.charAt(i);
        	 }
        	 if(i<Str.length()-1&&Str.charAt(i+1)==Str.charAt(i)) {
        		 count++;
        	 }
        	 if(i<Str.length()-1&&Str.charAt(i+1)!=Str.charAt(i)&&count>1||i==Str.length()-1&&count>1) {
        		 res +=count;
        		 count = 1;
        		 }
         }
         System.out.print(res);
     }
 }
    
