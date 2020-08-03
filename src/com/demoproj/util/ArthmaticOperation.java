package com.demoproj.util;

public class ArthmaticOperation {

	public static void main(String[] args) {
		try {
				ArthmaticOperation opr = new ArthmaticOperation();
				int ans = opr.add(10,20);
				System.out.println("The addition is : "+ans);
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
	
	
	public int add(int a,int b) throws Exception{
		return a+b;
	}

}
