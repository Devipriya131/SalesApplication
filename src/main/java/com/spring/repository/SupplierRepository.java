package com.spring.repository;

/**
 * @author dsozhara
 **/

import com.spring.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
