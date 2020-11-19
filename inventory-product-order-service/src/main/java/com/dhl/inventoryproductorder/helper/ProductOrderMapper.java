package com.dhl.inventoryproductorder.helper;

import java.time.LocalDate;

import com.dhl.inventoryproductorder.dto.ProductOrderRequest;
import com.dhl.inventoryproductorder.dto.ProductOrderResponse;
import com.dhl.inventoryproductorder.entity.Distributor;
import com.dhl.inventoryproductorder.entity.Product;
import com.dhl.inventoryproductorder.entity.ProductOrder;
import com.dhl.inventoryproductorder.enums.OrderStatus;
import com.dhl.inventoryproductorder.enums.QualityCheck;

public class ProductOrderMapper {

	
	public static ProductOrderResponse entityToDto(ProductOrder productOrder) {
		return ProductOrderResponse.builder()
			.productOrderId(productOrder.getProductOrderId())
			.productId(productOrder.getProduct().getProductId())
			.quantity(productOrder.getQuantity())
			.pricePerUnit(productOrder.getPricePerUnit())
			.qualityCheck(productOrder.getQualityCheck())
			.orderStatus(productOrder.getOrderStatus())
			.deliveryDate(productOrder.getDeliveryDate())
			.manufactureDate(productOrder.getManufactureDate())
			.expiryDate(productOrder.getExpiryDate())
			.orderedOn(productOrder.getOrderedOn())
			.distributorName(productOrder.getDistributor().getName())
			.distributorId(productOrder.getDistributor().getDistributorId())
			.productName(productOrder.getProduct().getMaterialName())
			.description(productOrder.getProduct().getDescription())
			.measurementUnit(productOrder.getProduct().getQuantityUnit())
			.warehouse(productOrder.getProduct().getWarehouse())
			.build();
	}
	
	
	public static ProductOrder DtoToEntity(ProductOrderRequest request) {
		ProductOrder order = new ProductOrder();
		Distributor distributor = new Distributor();
		distributor.setDistributorId(request.getDistributorId());
		Product product = new Product();
		product.setProductId(request.getProductId());
		order.setProduct(product);
		order.setQuantity(request.getQuantity());
		order.setPricePerUnit(request.getPricePerUnit());
		order.setQualityCheck(QualityCheck.valueOf(request.getQualityCheck()));
		order.setDeliveryDate(request.getDeliveryDate());
		order.setExpiryDate(request.getExpiryDate());
		order.setManufactureDate(request.getManufactureDate());
		order.setOrderStatus(OrderStatus.Processing);
		order.setDistributor(distributor);
		order.setOrderedOn(LocalDate.now());
		return order;
	}
}
