package test;

public class Palindrome {

	public static void main(String[] args) {
		String tr = "ammay";
		char str[] = tr.toCharArray();
		IsPalindrome(str);
if(IsPalindrome(str)) {
			System.out.print(" This is palindrome");
		}
else {
	System.out.println(" this is note Plaindrome");
}
		
		
	}
	public static boolean IsPalindrome(char str[]) {
		int start = 0,end = str.length-1;
		while(start<end) {
			if(str[start]!=str[end]) {
				return false;
				}
				start++;
				end--;
		
		}
		return true;
	
	}

}
