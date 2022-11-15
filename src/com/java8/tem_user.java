package com.java8;

public class tem_user extends salary {
 public double getMin_bal() {
		return min_bal;
	}
	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}
private double min_bal;
	public void cal_tax(){
	double sal=getSalary();
	sal=sal-getMin_bal();
	System.out.println("temparary employee balance"+sal);
};
}
