package com.spring.repository;

/**
 * @author dsozhara
 **/

import com.spring.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

