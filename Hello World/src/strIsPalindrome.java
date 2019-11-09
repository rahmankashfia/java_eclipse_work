import java.util.*;

public class strIsPalindrome{
    
    public static void main(String[] args){
    	String s = "";

    	if(s.isEmpty()){
    		System.out.println("Empty string");
    		//return;
    	}

		for(int i = 0; i < s.length()/2; i++){
		
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				System.out.println("Not Palindrome");
			//	return;
			}
			
		}
		System.out.println("palindrome");

		String s1 = "Tact Coa";
		s1 = s1.toLowerCase();
		boolean[] fl = new boolean[s1.length()];
	    int len = s1.length();

		for(int i = 0 ; i < s1.length(); i++){
			if(s1.charAt(i) == ' '){
				len = len -1;
				fl[i] = true;
				continue;
			}
			else if(fl[i] == false && s1.indexOf(s1.charAt(i),i+1) >= 0){
				fl[i] = true;
				fl[s1.indexOf(s1.charAt(i),i+1)] = true;
				len = len -2;
				System.out.println(s1 + " " + i + " "+s1.indexOf(s1.charAt(i),i+1));
				System.out.println("len " + len);
				System.out.println(Arrays.toString(fl));

			}
		}

		if(len == 0 || len == 1){
			System.out.println("Match");
		}
		else
			System.out.println("Not Match");

    }
	
}