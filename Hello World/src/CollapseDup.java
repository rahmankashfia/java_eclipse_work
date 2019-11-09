class CollapseDup{

	public static void main(String[] args){

		int i = 0; 
		String result = "";
		String a = "aabbcc";

		while (i < a.length()) { 
			char ch = a.charAt(i); 
			result += ch; 
				while (i < a.length()-1 && a.charAt(i+1) == ch) { 
					i++; 
				} 
			i++; 
		} 
		System.out.println(result);
	}
}