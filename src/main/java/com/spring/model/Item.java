package com.spring.model;

/**
 * @author dsozhara
 **/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemNumber;
    private String itemName;
    private double itemRating;

    // Getters and Setters
    public Long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemRating() {
        return itemRating;
    }

    public void setItemRating(double itemRating) {
        this.itemRating = itemRating;
    }
}
