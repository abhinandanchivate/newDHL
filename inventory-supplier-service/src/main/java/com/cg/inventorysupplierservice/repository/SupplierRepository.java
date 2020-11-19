/**
 * @author Abhinandan
 * @email Abhinandan
 * @create date 2020-11-02 00:55:23
 * @modify date 2020-11-02 00:55:23
 * @desc Supplier Repository JPA
 */
package com.cg.inventorysupplierservice.repository;

import com.cg.inventorysupplierservice.entity.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
