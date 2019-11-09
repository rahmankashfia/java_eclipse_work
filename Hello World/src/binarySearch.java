class binarySearch{

	public static void main(String[] args){

		int[] ar = {10,20,30,40,50,60};

		int result1 = 33;
		//int result2 = 10;
		//int result3 = 33;

		int i = 0;
		int j = ar.length -1;
		
        
        while(i<j){
        	int mid = (i+j)/2;
			if(ar[mid] == result1){
				System.out.println(result1+" found index "+ mid);
				return;
			}
			else if(result1 > ar[mid])
				i = mid+1;
			else if(result1 < ar[mid])
				j = mid;
		}
		return;
	}
}