package com.spring.controller;

/**
 * @author dsozhara
 **/

import com.spring.model.Item;
import com.spring.model.Purchase;
import com.spring.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @PostMapping
    public Purchase addPurchase(@RequestBody Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @PostMapping("/bulk")
    public List<Purchase> addPurchases(@RequestBody List<Purchase> purchases) {
        return purchaseRepository.saveAll(purchases);
    }

    @GetMapping
    public List<Purchase> getAllItems() {
        return purchaseRepository.findAll();
    }

    @GetMapping("/year/{year}")
    public List<Purchase> getPurchasesByYear(@PathVariable int year) {
        return purchaseRepository.findPurchasesByYear(year);
    }
}

