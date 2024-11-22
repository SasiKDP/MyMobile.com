package com.mymobile.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product 
{
	 @Id  // This annotation designates the field as the primary key
	    private String productId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
