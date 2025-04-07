package com.pms.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name = "customer")
public class Customer extends BaseEntity { 

	@Column(name = "cust_email", length = 50, unique = true)
	private String customerEmail;

	@Column(name = "cust_passowrd", length = 100)
	private String customerPassword;

	@Column(length = 50, name = "cust_firstname")
	private String customerFirstName;
	
	@Column(length = 50, name = "cust_lastname")
	private String customerLastName;

	@Column(name = "cust_mobile", length = 10)
	private String customerMobile;

	@Column(length = 100, name = "cust_address")
	private String customerAddress;

	@Column(name = "cust_registration_date")
	private LocalDate customerRegDate;

	@Lob
	@Column(name = "cust_image")
	private String customerImage;

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public LocalDate getCustomerRegDate() {
		return customerRegDate;
	}

	public void setCustomerRegDate(LocalDate customerRegDate) {
		this.customerRegDate = customerRegDate;
	}

	public String getCustomerImage() {
		return customerImage;
	}

	public void setCustomerImage(String customerImage) {
		this.customerImage = customerImage;
	}

	
	

	
}
