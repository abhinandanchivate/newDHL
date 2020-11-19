package com.dhl.inventoryproductorder.service;

import java.util.List;
import java.util.Map;

import com.dhl.inventoryproductorder.dto.ProductOrderRequest;
import com.dhl.inventoryproductorder.dto.ProductOrderResponse;
import com.dhl.inventoryproductorder.dto.UpdateStatusDto;

public interface ProductOrderService {

	ProductOrderResponse fetchProductOrderById(long productOrderId);
	
	List<ProductOrderResponse> fetchAllProductOrders();
	
	ProductOrderResponse updateProductOrderDeliveryStatus(UpdateStatusDto updateStatusDto);
	
	Map<String, String> createProductOrder(ProductOrderRequest productOrder);
	
}