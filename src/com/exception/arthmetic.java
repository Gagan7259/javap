package com.exception;

public class arthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(10/0);
		try {
			System.out.println(10 / 0);

		} catch (Exception e) {
			System.out.println(e.toString());

		}
		;
	}

}
