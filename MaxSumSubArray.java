
public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] arr = { 5 , 9 , 9 , 1 , 3 , 2 , 8 , 8 };
		int MaxSum =0;
		int Csum = 0 ;
		//int k = 2;
	for(int i = 0 ; i< arr.length-1;i++) {
		for(int j = i ; j < i+2;j++) {
			
			try {
			 Csum = arr[j] + arr[j+1] + arr[j+2];
			}
			catch(Exception ex) {
				System.out.println(ex);
				
			}
			
	        if(MaxSum <Csum) {
	        	MaxSum = Csum;
	        }

		}
		
					
	}
 System.out.println(MaxSum);
	}

}
