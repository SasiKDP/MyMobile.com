package com.mymobile.serviceimpl;



import java.time.LocalDate;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.mymobile.Repository.VendorRepository;
import com.mymobile.entity.Vendor;
import com.mymobile.registrationrequest.Vendorpayload;
import com.mymobile.service.VendorService;

import jakarta.validation.Valid;

@Service
public class VendorServiceImpl implements VendorService {

    private final VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }
   
    public void registerVendor(Vendorpayload vendorPayload) {
    	
        if (!vendorPayload.getPassword().equals(vendorPayload.getConfirmPassword())) {
            throw new IllegalArgumentException("Passwords do not match.");
        }

        // Hash the password using BCrypt
        String hashedPassword = hashPassword(vendorPayload.getPassword());

        // Create a Vendor entity from the payload
        Vendor vendor = new Vendor();
        vendor.setVendorId(vendorPayload.getVendorId());
        vendor.setVendorName(vendorPayload.getVendorName());
        vendor.setPassword(hashedPassword);
        vendor.setAddress(vendorPayload.getAddress());
        vendor.setRoleType(vendorPayload.getRoleType());
        vendor.setEmailId(vendorPayload.getEmailId());
        vendor.setPhoneNumber(vendorPayload.getPhoneNumber());
        vendor.setPincode(vendorPayload.getPincode());
        vendor.setRegistrationDate(LocalDate.now());
        vendor.setPanNumber(vendorPayload.getPanNumber());
        vendor.setGstNumber(vendorPayload.getGstNumber());

        // Save the Vendor entity to the database
        vendorRepository.save(vendor);
    }
    
 // VendorServiceImpl.java
    @Override
    public void saveVendor(Vendor vendor) {
        vendorRepository.save(vendor);
    }
    
    @Override
    public Optional<Vendor> getVendorById(String vendorId) {
        return vendorRepository.findById(vendorId);
    }
    
   
    @Override
    public void deleteVendorById(String vendorId) {
        if (!vendorRepository.existsById(vendorId)) {
            throw new IllegalArgumentException("Vendor with ID " + vendorId + " does not exist.");
        }
        vendorRepository.deleteById(vendorId);
    }

    
    // Utility method to hash passwords
   
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    @Override
	public void registerVendor(Object registrationRequest) {
		// TODO Auto-generated method stub
		
	}

    @Override
	public void registerVendor(@Valid Vendor vendor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Vendor> getVendorByEmail(String email) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
}