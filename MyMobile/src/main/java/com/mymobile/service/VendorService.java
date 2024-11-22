package com.mymobile.service;

import java.util.Optional;

import com.mymobile.entity.Vendor;
import com.mymobile.registrationrequest.Vendorpayload;

import jakarta.validation.Valid;

public interface VendorService {
    void registerVendor(Vendorpayload vendorPayload);
    Optional<Vendor> getVendorById(String vendorId);
    Optional<Vendor> getVendorByEmail(String email);
    void deleteVendorById(String vendorId);
	void saveVendor(Vendor vendor);
	void registerVendor(Object registrationRequest);
	void registerVendor(@Valid Vendor vendor);
}