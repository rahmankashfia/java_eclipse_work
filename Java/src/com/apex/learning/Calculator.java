package com.apex.learning;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte aByte = 0;
		byte bByte = 0;
		short aShort = 0;
		short bShort = 0;
		int aInt = 0;
		int bInt = 0;
		long aLong = 0;
		long bLong = 0;
		float aFloat = 0;
		float bFloat = 0;
		double aDouble = 0;
		double bDouble = 0;
		int resultByte = 0;
		int resultShort = 0;
		int resultInt = 0;
		long resultLong = 0;
		float resultFloat = 0;
		double resultDouble = 0;
		
		while (true) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			// Showing Menu
			System.out.println("Choose an operation from the following menu");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multipy");
			System.out.println("4. Divition");
			System.out.println("5. Exit");
			int choice = input.nextInt();
			
			if (choice == 5) {
				System.out.println("Program exiting .....");
				break;
			} else {
				System.out.println("Type of the number");
				System.out.println("1. byte - 1 byte");
				System.out.println("2. short - 2 bytes");
				System.out.println("3. int - 4 bytes");
				System.out.println("4. long - 8 bytes");
				System.out.println("5. float");
				System.out.println("6. double");
				System.out.println("Enter number type : ");
				int typeinput = input.nextInt();
				
				// taking input
				if (typeinput == 1) {
					System.out.print("Enter first byte value:");
					aByte = input.nextByte();
					System.out.print("Enter second byte value:");
					bByte = input.nextByte();
				} else if (typeinput == 2) {
					System.out.print("Enter first short value:");
					aShort = input.nextShort();
					System.out.print("Enter second short value:");
					bShort = input.nextShort();
				} else if (typeinput == 3) {
					System.out.print("Enter first int value:");
					aInt = input.nextInt();
					System.out.print("Enter second int value:");
					bInt = input.nextInt();
				} else if (typeinput == 4) {
					System.out.print("Enter first long value:");
					aLong = input.nextLong();
					System.out.print("Enter second long value:");
					bLong = input.nextLong();
				} else if (typeinput == 5) {
					System.out.print("Enter first float value:");
					aFloat = input.nextFloat();
					System.out.print("Enter second float value:");
					bFloat = input.nextFloat();
				} else if (typeinput == 6) {
					System.out.print("Enter first double value:");
					aDouble = input.nextDouble();
					System.out.print("Enter second double value:");
					bDouble = input.nextDouble();
				}
				
				
				if (choice == 1) {
					if (typeinput == 1) {
						resultByte = aByte + bByte;
						System.out.println("Result : " + resultByte);
					} else if (typeinput == 2) {
						resultShort = aShort + bShort;
						System.out.println("Result :" + resultShort);
					} else if (typeinput == 3) {
						resultInt = aInt + bInt;
						System.out.println("Result :" + resultInt);
					} else if (typeinput == 4) {
						resultLong = aLong + bLong;
						System.out.println("Result :" + resultLong);
					} else if (typeinput == 5) {
						resultFloat = aFloat + bFloat;
						System.out.println("Result :" + resultFloat);
					} else if (typeinput == 6) {
						resultDouble = aDouble + bDouble;
						System.out.println("Result :" + resultDouble);
					}
				} else if (choice == 2) {
					if (typeinput == 1) {
						resultByte = aByte - bByte;
						System.out.println("Result : " + resultByte);
					} else if (typeinput == 2) {
						resultShort = aShort - bShort;
						System.out.println("Result :" + resultShort);
					} else if (typeinput == 3) {
						resultInt = aInt - bInt;
						System.out.println("Result :" + resultInt);
					} else if (typeinput == 4) {
						resultLong = aLong - bLong;
						System.out.println("Result :" + resultLong);
					} else if (typeinput == 5) {
						resultFloat = aFloat - bFloat;
						System.out.println("Result :" + resultFloat);
					} else if (typeinput == 6) {
						resultDouble = aDouble - bDouble;
						System.out.println("Result :" + resultDouble);
					} 
				} else if (choice == 3) {
					if (typeinput == 1) {
						resultByte = aByte * bByte;
						System.out.println("Result : " + resultByte);
					} else if (typeinput == 2) {
						resultShort = aShort * bShort;
						System.out.println("Result :" + resultShort);
					} else if (typeinput == 3) {
						resultInt = aInt * bInt;
						System.out.println("Result :" + resultInt);
					} else if (typeinput == 4) {
						resultLong = aLong * bLong;
						System.out.println("Result :" + resultLong);
					} else if (typeinput == 5) {
						resultFloat = aFloat * bFloat;
						System.out.println("Result :" + resultFloat);
					} else if (typeinput == 6) {
						resultDouble = aDouble * bDouble;
						System.out.println("Result :" + resultDouble);
					}
				} else if (choice == 4) {
					if (typeinput == 1) {
						resultByte = aByte / bByte;
						System.out.println("Result : " + resultByte);
					} else if (typeinput == 2) {
						resultShort = aShort / bShort;
						System.out.println("Result :" + resultShort);
					} else if (typeinput == 3) {
						resultInt = aInt - bInt;
						System.out.println("Result :" + resultInt);
					} else if (typeinput == 4) {
						resultLong = aLong / bLong;
						System.out.println("Result :" + resultLong);
					} else if (typeinput == 5) {
						resultFloat = aFloat / bFloat;
						System.out.println("Result :" + resultFloat);
					} else if (typeinput == 6) {
						resultDouble = aDouble / bDouble;
						System.out.println("Result :" + resultDouble);
					}
				}
			}
			System.out.println("------------------------------------------------------------");
		}	
	}
}


