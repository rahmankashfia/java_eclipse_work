import java.util.*;

public class Sort{
	public static void main(String[] args){
		int[] a = {2,2,2,2,2,2,2};
		if(a.length == 2){
    		if(a[0] == a[1]){
     			int[] res = new int[1];
     			res[0] = a[0];
     			System.out.println(Arrays.toString(res));
    		}
  			else{
      			if(a[0]>a[1]){
        			int temp = a[0];
        			a[0] = a[1];
        			a[1] = temp;
        			System.out.println(Arrays.toString(a));
      			}
    		}
  		}
  		else if(a.length >2){
    		Arrays.sort(a);
    		String s = "";
    		
    		for(int i = 0;i < a.length; i++){
      			s= s+ String.valueOf(a[i]);
      			while( i <a.length -1 && a[i] == a[i+1]){
        			i = i+1;
      			}
    		}
    		
    		int[] res = new int[s.length()];
    		
    		for(int i = 0; i<s.length(); i++){
      			res[i] = Integer.parseInt(s.substring(i,i+1));
    		}
    		System.out.println(Arrays.toString(res));
  		}
  		//System.out.println(Arrays.toString(a));
	}
}