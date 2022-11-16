package com.practice;

public class exception {
	public static void main(String[]args)
	{
		int[] marks= {23,34,45,56,78};	
		try {
			System.out.println(marks[10]);

		}
		catch(Exception e) {
			//System.out.println(e.toString());
			System.out.println(e);

		}
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);

	}
}
