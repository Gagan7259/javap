package com.java8;

public class permanent_user extends salary {
	 private double min_bal;

	public double getMin_bal() {
		return min_bal;
	}

	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}

	public void cal_tax() {
		double sal=getSalary();
		sal=sal-getMin_bal();
		System.out.println("permanent employee balance"+sal);
	};
}
