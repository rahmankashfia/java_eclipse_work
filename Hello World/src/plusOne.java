import java.util.*;

public class plusOne{

	public static void main(String[] args){
		int[] digits = {9};
		
		for(int i = digits.length-1; i>=0; i--){
			//System.out.println(digits[i]);
			if(digits[i] < 9){
				digits[i]++;
				System.out.println(Arrays.toString(digits));
				return;
			}
			digits[i] = 0;
		}

		if(digits[0] == 0){
			int[] res = new int[digits.length+1];
			res[0] = 1;
			System.out.println(Arrays.toString(res));
			return;
		}
		
	}
}