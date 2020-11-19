package com.dhl.inventoryproductorder.service;

public interface UpdateStockService {

  boolean updateProductStock(Long productId, Double quantity);

}
