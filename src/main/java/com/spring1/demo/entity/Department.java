package com.spring1.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long DepartmentID;
	private String DepartmentName;
    private String DepartmenAddress;
    private String DepartmentCode;
    
	public Department() {
		
	}
	

	@Override
	public String toString() {
		return "Department [DepartmentID=" + DepartmentID + ", DepartmentName=" + DepartmentName + ", DepartmenAddress="
				+ DepartmenAddress + ", DepartmentCode=" + DepartmentCode + "]";
	}


	public Department(long departmentID, String departmentName, String departmenAddress, String departmentCode) {
		super();
		DepartmentID = departmentID;
		DepartmentName = departmentName;
		DepartmenAddress = departmenAddress;
		DepartmentCode = departmentCode;
	}
	
    
    public long getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(long departmentID) {
		DepartmentID = departmentID;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getDepartmenAddress() {
		return DepartmenAddress;
	}
	public void setDepartmenAddress(String departmenAddress) {
		DepartmenAddress = departmenAddress;
	}
	public String getDepartmentCode() {
		return DepartmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		DepartmentCode = departmentCode;
	}
	

}