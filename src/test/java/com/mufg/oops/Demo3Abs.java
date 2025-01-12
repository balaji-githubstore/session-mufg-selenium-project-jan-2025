package com.mufg.oops;

abstract class Employee
{
	public int empId;
	public int empName;
	
	public void printEmployee()
	{
		System.out.println(empId);
	}
	
	public abstract void calculateSalary();
}

class PermanentEmployee extends Employee
{
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
	}
	
}
class ContractEmployee extends Employee
{

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Demo3Abs {
	
	public static void main(String[] args) {
		
		Employee e=new PermanentEmployee();
		e.printEmployee();
		e.calculateSalary();//always override method
	}

}
