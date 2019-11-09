import java.util.*;

public class strSpaceReplace{

	public static void main(String[] args){

		String s = "            ";
		char[] ch = s.toCharArray();
		int len = 3;
		int true_len = s.length()-1;
		System.out.println(s+" "+ true_len);

		char r1 = '%';
		char r2 = '2';
		char r3 = '0';

        for(int i = len; i >= 0 ;i--){
        	
			if( ch[i] == ' '){
				ch[true_len--] = r3; // assignment and then decrement
				ch[true_len--] = r2;
				ch[true_len--] = r1;
			}
			else{
				ch[true_len] = ch[i];
				true_len--;

			}
			System.out.print(ch);
        	System.out.println(" len : "+i+" true_len: " +true_len);
		}
		//System.out.println(ch);

		String s1 = "    ";           
		System.out.println("Using replace " + s1.replace(" ","20%"));
	}
}