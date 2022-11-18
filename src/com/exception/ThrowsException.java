package com.exception;

public class ThrowsException extends Exception {
	ThrowsException() {
		super();
	}

	class User {
		public void checkactivity() throws ThrowsException {
			double sal = 25000;
			if (sal < 10000) {
				throw new ThrowsException("I'm realy sorry");
			} else {
System.out.println("Pandago Enjoy");
			}
			;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException();
	}

}
