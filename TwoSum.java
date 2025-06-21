package leatCode;

public class TwoSum {

	public static void main(String[] args) {
		int [] arr = {2,4,5,2,};
		int Target = 6;
		twoSums(arr, Target);
					
		}
	public  static int[] twoSums(int[] arr,int Target) {
		int n = arr.length;
	
		for(int i = 0;i<n-1;i++) {
			 for(int j = i+1;j<n;j++) {
				 if(arr[i]+arr[j]==Target) {
					 return new int[] {i,j};
				 }
	
		
	}
			 }
		return new int[] {};
		}
	}
	
		
	
	
