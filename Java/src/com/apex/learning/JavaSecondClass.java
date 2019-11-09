package com.apex.learning;
import java.util.*;

public class JavaSecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5, 4));
		System.out.println("1. Boolean : true false");
		System.out.println("2. byte - 1 byte");
		System.out.println("3. int - 4 byte");
		System.out.println("4. long - 8 byte");
		System.out.println("5. float");
		System.out.println("6. double");
		System.out.println("7. char");
		System.out.println("8. Short");
		System.out.println("9. Exit");
		Random randomGenerator = new Random();
		while (true) {
			int randomChoice = randomGenerator.nextInt(9) + 1;
			System.out.println(randomChoice);
			if (randomChoice == 1) {
				System.out.println(randomChoice % 2);
			} else if (randomChoice == 2) {
				System.out.println("This is min value for integer :" + Integer.MIN_VALUE);
				System.out.println("This is max value for integer :" + Integer.MAX_VALUE);
			}
			if (randomChoice == 9) {
				break;
			}
		}
		
	}
	/* access modifier : public private 
	 * return type.... input argument/parameters...function name verb*/
	
	public static int sum(int a, int b) {		
		int c = a + b;
		return c;
	}
	
	public static int uniPrefixOpAdd(int a) {
		
		return a++;
		
	}
	
	public static int uniPrefixOpSub(int a) {
		
		return a--;
		
	}
	
	
}
