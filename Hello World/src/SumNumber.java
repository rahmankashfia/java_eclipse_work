public class SumNumber{
	public static void main(String[] args){
		int sum = 0;
        String str = "aa33bb11";
      	for(int i = 0; i< str.length(); i++){
        	String num="";
        	while(i < str.length() && Character.isDigit(str.charAt(i))){
          		num= num + String.valueOf(str.charAt(i));
          		i++;
        	}
        System.out.println(num+" i="+i);
        if(num == "")
        	sum = sum +0;
        else
          	sum = sum + Integer.parseInt(num);
          
      	}
  	  	System.out.println(sum);
	}
}