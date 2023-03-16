package com.junit.demo;

public class MathUtils {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public boolean checkPrimeNo(int n) {
		
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n % i ==0) count++;
		}
		if(count == 2) return true;
		else return false;
	}
	
}
