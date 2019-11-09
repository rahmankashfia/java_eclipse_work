import java.util.*;

public class strHasUniqueCharWithoutAddDs{

	public static void main(String[] args){
		String s = "";
		if(s.isEmpty()){
			System.out.println("String is empty");
			return;
		}
		char[] chAr = s.toCharArray();
		System.out.println(chAr);

		Arrays.sort(chAr);
		System.out.println(chAr);

		for(int i = 0; i < chAr.length-1; i++){
			if(chAr[i] != chAr[i+1])
				continue;
			else{
				System.out.println("Not unique");
				return;
			}

		}
		System.out.println("Unique");
			
	}
}