package com.spring.controller;

/**
 * @author dsozhara
 **/

import com.spring.model.Item;
import com.spring.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @PostMapping("/bulk")
    public List<Item> addSuppliers(@RequestBody List<Item> items) {
        return itemRepository.saveAll(items);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}

