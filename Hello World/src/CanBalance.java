public class CanBalance{

	public static void main(String[] args){

		int[] nums = {2, 1, 1, 2, 1};
		int sum1 = 0;
		int sum2 = 0;
		int ar_len = nums.length;
		if(ar_len == 1)
			System.out.println(false);
		else if(ar_len == 2 && nums[0] != nums[1])
			System.out.println(false);
		else if(ar_len >= 3){
			int i = 0;
			int j = ar_len-1;
			sum1 = sum1 + nums[i];
			sum2 = sum2 + nums[j];
			while(i<j){
				if(sum1>sum2){
					j--;
					sum2 = sum2 + nums[j];
				}
				else if(sum1<sum2){
					i++;
					sum1 = sum1 + nums[i];
				}
				else if(sum1 == sum2 && i!=j){
					i++;
					j--;
					sum1 = sum1 + nums[i];
					sum2 = sum2 + nums[j];
				}
				System.out.println("sum1 :"+sum1);
				System.out.println("sum2 :"+sum2);
			}
	    }
	    if(sum1 == sum2)
			System.out.println(true);
			
	}
}