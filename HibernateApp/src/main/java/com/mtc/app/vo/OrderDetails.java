package com.mtc.app.vo;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;
@Entity
@Table(name="orderdetails")
public class OrderDetails implements Serializable{
	
@Id
@OneToOne
@JoinColumn(name="orderNumber")
private Orders order;

@OneToOne
@JoinColumn(name="productCode")
private Products product;
private int quantityOrdered;
private BigDecimal priceEach;
private int orderLineNumber;
public Orders getOrder() {
	return order;
}
public void setOrder(Orders order) {
	this.order = order;
}
public Products getProduct() {
	return product;
}
public void setProduct(Products product) {
	this.product = product;
}
public int getQuantityOrdered() {
	return quantityOrdered;
}
public void setQuantityOrdered(int quantityOrdered) {
	this.quantityOrdered = quantityOrdered;
}
public BigDecimal getPriceEach() {
	return priceEach;
}
public void setPriceEach(BigDecimal priceEach) {
	this.priceEach = priceEach;
}
public int getOrderLineNumber() {
	return orderLineNumber;
}
public void setOrderLineNumber(int orderLineNumber) {
	this.orderLineNumber = orderLineNumber;
}
@Override
public String toString() {
	return "OrderDetails [order=" + order + ", product=" + product + ", quantityOrdered=" + quantityOrdered
			+ ", priceEach=" + priceEach + ", orderLineNumber=" + orderLineNumber + "]";
}

}
