package com.apex.learning;

public class JavaThirdClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FlowControl fc = new FlowControl(10);
	fc.forLoop(100);
	}
	
}

class FlowControl {
	int n;
	
	FlowControl(int n) {
		this.n = n;
	}
	
	
	
	void forLoop(int loopCount) {
		int even = 0;
		int odd = 0;
		for (int i = 0; i < loopCount; i++) {
			if (i % 2 == 0) {
				System.out.println("Even : " + i);
				even++;
			} else {
				System.out.println("Odd : " + i);
				odd++;
			}
		
		}
		System.out.println("Total even : " + even);
		System.out.println("Total odd : " + odd);
	}
}

/*
Market: So good. 

	
	*/
