
public class RemvElem {

	public static void main(String[] args) {
		int val = 3 ; 
		int [] nums = {3,2,2,3};
		remDup(nums,val);
		

	}
	public static int remDup(int[] nums,int val) {
		if(nums.length==0) return 0;
		int k = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i]!=val) {
				nums[k]= nums[i];
				k++;
			}
		}
		System.out.println("K = " + k);
		for(int i = 0 ; i < k ; i ++) {
			System.out.print(nums[k]);
		}
		
		return k;
	}

}
