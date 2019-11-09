import java.util.*;

public class stringIntScanner{

	public static void main(String[] args){
		System.out.println("Hello World");

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.println(a+b);
		System.out.println(a+" "+b);

		System.out.println(c+d);
		System.out.println(c+" "+d);
		
		sc.close();
		
	}

}