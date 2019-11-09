import java.util.*;

class validParenthesis {
    public boolean isValid(String s) {
        if(s.isEmpty()){
        	return false;
        }
        
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i< s.length(); i++){
        	if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
        		st.push(s.charAt(i));

        	else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
        		if(st.isEmpty() == false){
        			char ch = st.pop();
        			if(ch == '(' && s.charAt(i) != ')')
        				return false;
        			else if(ch == '{' && s.charAt(i) != '}')
        				return false;
        			else if(ch == '[' && s.charAt(i) != ']')
        				return false;
        			else 
        				continue;
     			}
     			else
     				return false;
        	}
        }
        if(st.isEmpty())
        	return true;
        else
        	return false;
        
    }


	public static void main(String[] args){

		String s1 = "([]";
		String s2 = "";
		String s3 = "[](){}";
		String s4 = "({})";
		String s5 = "([)]";

		validParenthesis vp = new validParenthesis();
		System.out.println(vp.isValid(s1));
		System.out.println(vp.isValid(s2));
		System.out.println(vp.isValid(s3));
		System.out.println(vp.isValid(s4));
		System.out.println(vp.isValid(s5));

	}
}