package com.democlass;

public class EmployeeBean {
	
	private DepartmentBean departmentBean;
	
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
//constructor DI
	public EmployeeBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	/*
	 * public DepartmentBean getDepartmentBean() { return departmentBean; }
	 * 
	 * public void setDepartmentBean(DepartmentBean departmentBean) {
	 * this.departmentBean = departmentBean; }
	 */

	public EmployeeBean() {
		
	}
}
