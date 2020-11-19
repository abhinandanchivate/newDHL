package com.dhl.inventoryproductorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhl.inventoryproductorder.entity.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
  
}
