import java.util.*;

public class strHasDuplicateChar{

// s can be null
// only alphabets or other characters
	public static void main(String[] args){

		// only ASCII (128)... extended 255... drawback unicode
		String s = "google";
		char[] ar = s.toCharArray();
		boolean[] fr = new boolean[128];
		if(s.isEmpty()){
			System.out.println("String is empty");
			//return;
		}
		for(int i = 0; i< ar.length; i++){
			int j = ar[i];
			if(fr[j] == false)
				fr[j] = true;
			else{
				System.out.println("Has Duplicate");
				break;
			}
		}

		// support UTF.. use hashmap

		HashMap<Character,Boolean> hm = new HashMap<Character,Boolean>();
		if(s.isEmpty()){
			System.out.println("Empty String");
			return;
		}
		for(int i = 0; i< s.length(); i++ ){
			System.out.println(s.charAt(i));
			if(hm.containsKey(s.charAt(i))){
				System.out.println("Hm Has duplicate");
				//return;
			}
			else{
				hm.put(s.charAt(i),true);	
			}
			
		}

		for(Map.Entry<Character,Boolean> entry : hm.entrySet()){
			System.out.println(entry.getKey()+" -> "+ entry.getValue());
		}

		// using set

		if(s.isEmpty()){
			System.out.println("String is empty");
		}
		HashSet<Character> hs = new HashSet<Character>();
		for(int i = 0; i< s.length(); i++){
			if(hs.contains(s.charAt(i))){
				System.out.println("Hashset : Has Duplicate.");
				return;
			}
			else{
				hs.add(s.charAt(i));
			}
		}
		System.out.println("No Duplicate");
	}
	
}