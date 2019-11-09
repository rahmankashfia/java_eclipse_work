import java.util.*;

public class strCheckPermutation{
	public static void main(String[] args){
		String str1 = "kash";
		String str2 = "ashp";
		if(str1.isEmpty() == true && str2.isEmpty() == true){
			System.out.println("Both strings are empty");
			return;
		}		

		if(str1.isEmpty() == true || str2.isEmpty() == true){
			System.out.println("One of the String is empty");
			return;
		}
		
		if(str1.length() != str2.length()) {
			System.out.println("Variable length");
			return;
		}

		else{
			char[] ar1 = str1.toCharArray();
			char[] ar2 = str2.toCharArray();
			Arrays.sort(ar1);
			Arrays.sort(ar2);

			str1 = String.valueOf(ar1);
			str2 = String.valueOf(ar2);

			if(str1.equals(str2))
			{
				System.out.println("Match found");
				//return;
			}
			else
				System.out.println("No Match");
		}
		
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i = 0; i< str1.length(); i++) {
			if(hm.containsKey(str1.charAt(i))) {
				hm.put(str1.charAt(i), hm.get(str1.charAt(i))+1);
			}
			else {
				hm.put(str1.charAt(i), 1);
			}
		}
		System.out.println(hm);
		for(int i = 0; i<str2.length(); i++) {
			
			if(hm.containsKey(str2.charAt(i))) {
				if(hm.get(str2.charAt(i)) > 0)
					hm.put(str2.charAt(i), hm.get(str2.charAt(i))-1);
				else {
					System.out.println("Not Match1");
					return;
				}
			}
			else {
				System.out.println("Not Match2");
				return;
			}
			
			//System.out.println(hm);
		}
		System.out.println("Match found");
		
	}
}