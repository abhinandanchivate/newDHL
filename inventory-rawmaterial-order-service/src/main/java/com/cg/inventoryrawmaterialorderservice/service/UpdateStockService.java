/**
 * @author abhi
 * @email abhi
 * @create date 2020-10-31 02:28:55
 * @modify date 2020-10-31 02:28:55
 * @desc Creates inter microservice communicaton
 */
package com.cg.inventoryrawmaterialorderservice.service;

public interface UpdateStockService {

  boolean updateProductStock(Long productId, Double quantity);

}
