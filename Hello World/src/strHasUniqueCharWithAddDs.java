import java.util.*;

public class strHasUniqueCharWithAddDs{
	public static void main(String[] args){
		String s = "";
		if(s.isEmpty()){
			System.out.println("String is Empty");
			return;
		}
		HashSet<Character> hs = new HashSet<Character>();
		for(int i = 0; i< s.length(); i++){
			if(hs.contains(s.charAt(i))){
				System.out.println("Not Unique");
				return;
			}
			else{
				hs.add(s.charAt(i));
			}
		}
		System.out.println("Unique");
	}
}