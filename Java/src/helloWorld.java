public class helloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++)
			System.out.println(String.valueOf(i) + " " + args[i].toString());
		
	}

}
