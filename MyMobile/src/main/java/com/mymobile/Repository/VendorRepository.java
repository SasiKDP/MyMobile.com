package com.mymobile.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymobile.entity.Vendor;

public interface VendorRepository  extends JpaRepository<Vendor, String> {

 

    // Find Vendor by Phone Number
    Optional<Vendor> findByPhoneNumber(String phoneNumber);

    // Find Vendor by GST Number
    Optional<Vendor> findByGstNumber(String gstNumber);

	Object findByEmailId(String emailId);


	

}
