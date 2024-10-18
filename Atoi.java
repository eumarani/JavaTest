package com.practice;

public class Atoi {
	public static void main(String[] args) {
		String s1="123";
		String s2="-123";
		String s3="1a23";
		try {
		int n1=Integer.parseInt(s1);
		System.out.println(n1);
		
		int n2=Integer.parseInt(s2);
		System.out.println(n2);
		}catch(Exception e) {
			System.out.println("Invalid number format");
		
		}try {
		int n3=Integer.parseInt(s3);
		System.out.println(n3);
		}catch(Exception e) {
			System.out.println("Invalid entry: -1" );
	}
	}

}
