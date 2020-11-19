
package com.dhl.inventorystockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhl.inventorystockmanagement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
