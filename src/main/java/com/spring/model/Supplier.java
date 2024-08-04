package com.spring.model;

/**
 * @author dsozhara
 **/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierNumber;
    private String supplierName;
    private double supplierRating;

    // Getters and Setters
    public Long getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(Long supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getSupplierRating() {
        return supplierRating;
    }

    public void setSupplierRating(double supplierRating) {
        this.supplierRating = supplierRating;
    }
}

