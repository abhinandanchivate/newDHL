/**
 * @author Abhinandan
 * @email Abhinandan
 * @create date 2020-11-02 00:53:34
 * @modify date 2020-11-02 00:53:34
 * @desc Warehouse JPA repository
 */
package com.cg.inventorysupplierservice.repository;

import com.cg.inventorysupplierservice.entity.Warehouse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {

}
