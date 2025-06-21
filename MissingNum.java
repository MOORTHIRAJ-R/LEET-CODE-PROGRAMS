
public class MissingNum {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6,7};
		
		int sumArr = 0;
		for(int i = 0;i<arr.length;i++) {
			sumArr+=arr[i];
		}
		
		int n = arr.length+1;
		
		int sum = (n * (n + 1)) / 2;
		
        int missingNUm = sum-sumArr;
        System.out.println(missingNUm);
	}

}
