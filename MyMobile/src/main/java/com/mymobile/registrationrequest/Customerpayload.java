package com.mymobile.registrationrequest;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customerpayload {

    @NotBlank(message = "Customer ID cannot be blank")
    private String customerId;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, max = 15, message = "Password must be between 8 and 15 characters")
    private String password;

    @NotBlank(message = "Confirm password cannot be blank")
    private String confirmPassword;

    @NotBlank(message = "Customer name cannot be blank")
    private String customerName;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Mobile number cannot be null")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits")
    private String mobileNum;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @NotNull(message = "Pincode cannot be null")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
    private String pincode;

    @NotBlank(message = "Role type cannot be blank")
    private String roleType;

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getConfirmPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCustomerId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMobileNum() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPincode() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRoleType() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
