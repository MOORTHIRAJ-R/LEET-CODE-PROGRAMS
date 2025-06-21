
public class RemDupEleSorArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,2,3,4,5,5};
        
        int k = remdup(nums);
		
		
        
	}
	public static int remdup(int[] nums) {
		if(nums.length==0) return 0;
		int k=1;
		
		for(int i =1 ;i<nums.length;i++) {
			if(nums[i] != nums[k-1]) {
				nums[k] = nums[i];
				k++;
			}
			
			
		}
		System.out.println("k =" + k);
		for(int j =0 ;j<k ;j++) {
			System.out.print(nums[j]);
		}
		
		
		return k;
		
	}

}
