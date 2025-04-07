package com.pms.pojos;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="admin_user")
public class AdminUser extends BaseEntity {
	
	
	@Column(name="admin_email", length=50, unique=true)
	private String adminEmail;
	
	@Column(name="admin_passowrd", length = 100)
	private String adminPassword;
	
	@Column(length=50, name="admin_firstname")
	private String adminFirstName;
	
	@Column(length=50, name="admin_lastname")
	private String adminLastName;
	
	@Column(name="admin_mobile", length=10)
	private String adminMobile;
	
	@Column(length=100, name="admin_address")
	private String adminAddress;
	
	@Column(name="admin_registration_date")
	private LocalDate adminRegDate;
	
	@Lob
	@Column(name="admin_image")
	private byte[] adminImage;

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminMobile() {
		return adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public LocalDate getAdminRegDate() {
		return adminRegDate;
	}

	public void setAdminRegDate(LocalDate adminRegDate) {
		this.adminRegDate = adminRegDate;
	}

	public byte[] getAdminImage() {
		return adminImage;
	}

	public void setAdminImage(byte[] adminImage) {
		this.adminImage = adminImage;
	}
	
	
	
}

