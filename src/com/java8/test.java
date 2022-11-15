package com.java8;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               tem_user  a1=new tem_user();
               a1.setEmp_id(101);
               a1.setEmp_name("gagan");
               a1.setSalary(45000);
               a1.setMin_bal(5000);
               a1.cal_tax();
               permanent_user a2=new permanent_user();

               a2.setEmp_id(101);
               a2.setEmp_name("gagan");
               a2.setSalary(50000);
               a2.setMin_bal(500);
               a2.cal_tax();
	}

}
