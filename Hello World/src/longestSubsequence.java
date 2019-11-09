import java.util.*;

class longestSubsequence{

	public static String s = "abppplee";
	public static String[] dict = {"able", "ale", "applee", "bale", "kangaroo"};
	public static HashMap<Character,ArrayList<Integer>> hm = new HashMap<Character,ArrayList<Integer>>();
	public static int index = -1;
	public static int large_lenth = -1;
		 
	public static void main(String[] args){

		for(int i = 0; i< s.length(); i++){

			ArrayList<Integer> order = new ArrayList<Integer>();
			if(hm.containsKey(s.charAt(i))){
				order = hm.get(s.charAt(i));
				order.add(i);
			}
			else{
				order.add(i);
			}
			hm.put(s.charAt(i),order);
			
		}
		System.out.println(hm);

		for(int i = 0; i< dict.length; i++){

			String str = dict[i];
		//	System.out.println(str);
			if(isSubsequence(str)){
				if(isLargerStr(str)){
					index = i;
					System.out.println(index+" "+large_lenth);
				}
			}
		}
		if(index >= 0)
			System.out.println(dict[index]);
		else
			System.out.println("No SS found");
	}

	public static boolean isSubsequence(String str){
		int currentOrder = -1;
		for(int i = 0; i< str.length(); i++){
			System.out.println(str.charAt(i));
			if(hm.containsKey(str.charAt(i))){
				System.out.println("00"+str.charAt(i));
				ArrayList<Integer> temp = hm.get(str.charAt(i));
				for(Integer j : temp){
					if(currentOrder > j)
						return false;
					else if(currentOrder < 0){
						currentOrder = j;
						break;
					}
					else if(currentOrder == j){
						if(currentOrder == temp.get(temp.size()-1))
							return false;
						else
							continue;
					}
					else{
						if(j>currentOrder)
							currentOrder = j;
							break;
					}

				}
				
			System.out.println(str.charAt(i)+" "+currentOrder);
			}
			else
				return false;
		}

		return true;
	}

	public static boolean isLargerStr(String str){
		if(str.length() > large_lenth){
			large_lenth = str.length();
			return true;
		}
		return false; 
	}
}