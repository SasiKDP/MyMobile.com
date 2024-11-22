package com.mymobile.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.mymobile.registrationrequest.Customerpayload;
import com.mymobile.registrationrequest.Vendorpayload;
//import com.mymobile.service.Customerservice;
import com.mymobile.service.VendorService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/register")
public class RegistrationController {

    private final VendorService vendorService;
//    private final Customerservice customerService;

    public RegistrationController(VendorService vendorService) {
        this.vendorService = vendorService;
//        this.customerService = customerService;
    }

    @PostMapping("/vendor")
    public ResponseEntity<String> registerVendor(@Valid @RequestBody Vendorpayload vendorPayload) {
        vendorService.registerVendor(vendorPayload);
        return new ResponseEntity<>("Vendor registered successfully", HttpStatus.CREATED);
    }

//    @PostMapping("/customer")
//    public ResponseEntity<String> registerCustomer(@Valid @RequestBody Customerpayload customerPayload) {
//        customerService.registerCustomer(customerPayload);
//        return new ResponseEntity<>("Customer registered successfully", HttpStatus.CREATED);
//    }
}
