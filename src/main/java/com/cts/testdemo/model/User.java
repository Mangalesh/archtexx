/**
 * 
 */
package com.cts.testdemo.model;

import java.io.Serializable;

/**
 * @author 376410
 *
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	String company;
	String age;
	String address;
	String pincode;
	String contactNo;
	
	/**
	 * 
	 */
	public User() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	
	
	
}
