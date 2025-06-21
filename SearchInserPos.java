
public class SearchInserPos {

	public static void main(String[] args) {
		int [] nums = {1,3,5,6};
		int target = 7;
      int index =  insersionPos(nums,target);
      System.out.println(index);
	}
	public static int insersionPos(int[] nums , int target) {
		for(int i = 0 ; i< nums.length ; i++) {
			 if(nums[i]==target) {
				return i;
			 }
			 else if(nums[i]>target) {
				 return i;
			 }
			 else if(nums[nums.length-1]<target ) {
				 return nums.length;
			 }
	
		}
	return -1;
	}

}
