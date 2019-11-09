import java.util.*;

class findVanish{
	public static void main(String[] args){

	    int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < nums.length; i ++) {
        	nums[(nums[i]-1) % n] += n;
        	System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i ++) {
        	if (nums[i] <= n) 
        		res.add(i+1);	
        } 
        System.out.println(res);
	}
}