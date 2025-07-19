package com.app.testone;

public class SampleJava {
	
	public static void main(String[] args) {
		String s = "Java";
		genSub(s,"",0);
	}

	
	public static void genSub(String s , String c, int in) {
		if(in==s.length()) {
			System.out.println(c);
			return;
		}
		//Recursive method
		//include -> character current subset
		genSub(s, c+s.charAt(in),in+1);
		//exclude current subset character
		genSub(s, c,in+1);
	}
}
