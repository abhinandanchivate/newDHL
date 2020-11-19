package com.dhl.inventorystockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhl.inventorystockmanagement.entity.RawMaterial;

public interface RawMaterialRepository extends JpaRepository<RawMaterial, Long> {

}
