package com.mymobile.entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
  

@SpringBootApplication

	@Entity
	public class Vendor{
	@Id
    @Size(min = 3, max = 35, message = "Vendor ID must be between 3 and 35 characters")
    @Pattern(regexp = "^[a-zA-Z0-9@#%$&]+$", message = "Vendor ID must be alphanumeric or contain @, #, %, $, &")
    private String vendorId;

    @NotBlank(message = "Vendor name cannot be blank")
    private String vendorName;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, max = 15, message = "Password must be between 8 and 15 characters")
    private String password;

    @NotBlank(message = "Address cannot be blank")
    @Size(max = 255, message = "Address cannot exceed 255 characters")
    private String address;

    @NotBlank(message = "Role type cannot be blank")
    private String roleType;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be valid")
    private String emailId;

    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phoneNumber; // Changed from Long to String

    @NotBlank(message = "Pincode cannot be blank")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
    private String pincode; // Changed from Integer to String

    @NotNull(message = "Registration date cannot be null")
    private LocalDate registrationDate;

    private LocalDate lastLoginDate;

    @NotBlank(message = "PAN number cannot be blank")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "Invalid PAN number format")
    private String panNumber;

    @NotBlank(message = "GST number cannot be blank")
    @Pattern(regexp = "^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[A-Z0-9]{1}[Z]{1}[A-Z0-9]{1}$", message = "Invalid GST number format")
    private String gstNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Product> products = new ArrayList<>(); // Initialize to avoid null references
		



		public String getVendorId() {
		return vendorId;
	}




	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}




	public String getVendorName() {
		return vendorName;
	}




	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getRoleType() {
		return roleType;
	}




	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}




	



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getPincode() {
		return pincode;
	}




	public void setPincode(String pincode) {
		this.pincode = pincode;
	}




	public LocalDate getRegistrationDate() {
		return registrationDate;
	}




	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}




	public String getPanNumber() {
		return panNumber;
	}




	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}




	public String getGstNumber() {
		return gstNumber;
	}




	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}




	public List<Product> getProducts() {
		return products;
	}




	public void setProducts(List<Product> products) {
		this.products = products;
	}




		@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", password=" + password + ", address="
				+ address + ", roleType=" + roleType + ", email=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", pincode=" + pincode + ", registrationDate=" + registrationDate + ", lastLoginDate=" + lastLoginDate
				+ ", panNumber=" + panNumber + ", gstNumber=" + gstNumber + ", products=" + products + "]";
	}




		public String getEmailId() {
			
			return null;
		}




		public LocalDate getLastLoginDate() {
			return lastLoginDate;
		}




		public void setLastLoginDate(LocalDate lastLoginDate) {
			this.lastLoginDate = lastLoginDate;
		}	
		
	}
	
