public class withoutString{

	public static void main(String[] args){
		String base = "xxx";
		String remove = "xx";

		int rem_len = remove.length();
		int base_len = base.length();
		
		int i = 0;
        while(i<= base_len-rem_len){

        	System.out.println(base.toLowerCase().substring(i,i+rem_len)+" "+(remove.toLowerCase())+" "+i);
        	if(base.toLowerCase().substring(i,i+rem_len).equals(remove.toLowerCase())){
        		if(i == 0){
        			System.out.println("i == 0");
        			base = base.substring(i+rem_len);
        		}
        		else if (i == base_len-rem_len+1){
        			System.out.println("i == base_len-rem_len "+(base_len-rem_len));
        			base = base.substring(0,i-1);
        		}
        		else{
       				System.out.println(base.substring(0,i)+base.substring(i+rem_len)+" i="+i);
        			base = base.substring(0,i)+base.substring(i+rem_len);
        		}

        		base_len = base.length();
        		System.out.println("Current base: "+base);
        	}
        	else
        		i++;
        	
        }
		System.out.println(base+" "+remove);
	}
}