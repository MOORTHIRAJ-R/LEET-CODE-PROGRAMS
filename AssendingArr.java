
public class AssendingArr {

	public static void main(String[] args) {
		int arr[] = {1,2,6,7,7,8};
		boolean ini = true ;
		
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i] <= arr[i+1]) {
				
			}
			else {
				ini=false;
			}
			
			}
		if(ini) {
			System.out.println("Yes ,Already Ascending order");
		}
		else {
			System.out.println("No ! ,not Ascending order");
		}
		
		}

	}

