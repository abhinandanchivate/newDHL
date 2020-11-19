
package com.dhl.inventorystockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhl.inventorystockmanagement.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long>{
	
}
