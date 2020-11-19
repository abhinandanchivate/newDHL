package com.dhl.inventorystockmanagement.service;

import java.util.List;

import com.dhl.inventorystockmanagement.entity.Product;
import com.dhl.inventorystockmanagement.entity.ProductStockRequest;
import com.dhl.inventorystockmanagement.entity.RawMaterial;
import com.dhl.inventorystockmanagement.entity.RawMaterialStockRequest;

public interface StockManagementService {

  List<Product> getAllProducts() ;

	Product getProductById(Long id) ;

	List<RawMaterial> getAllRawMaterials() ;

	RawMaterial getRawMaterialById(Long id) ;

	Product saveProduct(Product product) ;

  RawMaterial saveRawMaterial(RawMaterial rawMaterial);
  
  Product updateProductStock(ProductStockRequest stockRequest);

  RawMaterial updateRawMaterialStock(RawMaterialStockRequest stockRequest);
}
