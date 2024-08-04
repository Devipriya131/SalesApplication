package com.spring.repository;

/**
 * @author dsozhara
 **/

import com.spring.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    @Query("SELECT p FROM Purchase p WHERE YEAR(p.date) = :year")
    List<Purchase> findPurchasesByYear(@Param("year") int year);
}


