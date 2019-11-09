class EvenlySpaced{
	public static void main(String[] args){

		int a = 10;
		int b = 9;
		int c = 9;
  		
  		if (Math.abs(a - b) == Math.abs(a - c)){
    		System.out.println(true);
  		} else if (Math.abs(b - a) == Math.abs(b - c)) {
    		System.out.println(true);
  		} else if (Math.abs(c - a) == Math.abs(c - b)) {
    		System.out.println(true);
  		}

  		//System.out.println(false);
	}
}