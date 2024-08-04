package com.spring.controller;

/**
 * @author dsozhara
 **/

import com.spring.model.Item;
import com.spring.model.Supplier;
import com.spring.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @PostMapping
    public Supplier createItem(@RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @PostMapping("/bulk")
    public List<Supplier> addSuppliers(@RequestBody List<Supplier> suppliers) {
        return supplierRepository.saveAll(suppliers);
    }

    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
}

