package com.example.springexample.model;

public class Employee {

	private String empNo;
	private String empName;
	private String manager;
	private String salary;
	private String deptNo;

	public Employee(String empNo, String empName, String manager, String salary, String deptNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.manager = manager;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", manager=" + manager + ", salary=" + salary
				+ ", deptNo=" + deptNo + "]";
	}

}
