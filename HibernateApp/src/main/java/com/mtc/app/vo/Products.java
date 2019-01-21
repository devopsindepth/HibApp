package com.mtc.app.vo;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
@Id
private String productCode;
private String productName;
@ManyToOne
@JoinColumn(name="productLine")
private productLines productLine;
private String productScale;
private String productVendor;
private String productDescription;
private int quantityInStock;
private BigDecimal buyPrice;
private BigDecimal MSRP;
@OneToOne(mappedBy="product")
private OrderDetails orderDetails;
public String getProductCode() {
	return productCode;
}
public void setProductCode(String productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public productLines getProductLine() {
	return productLine;
}
public void setProductLine(productLines productLine) {
	this.productLine = productLine;
}
public String getProductScale() {
	return productScale;
}
public void setProductScale(String productScale) {
	this.productScale = productScale;
}
public String getProductVendor() {
	return productVendor;
}
public void setProductVendor(String productVendor) {
	this.productVendor = productVendor;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getQuantityInStock() {
	return quantityInStock;
}
public void setQuantityInStock(int quantityInStock) {
	this.quantityInStock = quantityInStock;
}
public BigDecimal getBuyPrice() {
	return buyPrice;
}
public void setBuyPrice(BigDecimal buyPrice) {
	this.buyPrice = buyPrice;
}
public BigDecimal getMSRP() {
	return MSRP;
}
public void setMSRP(BigDecimal mSRP) {
	MSRP = mSRP;
}
@Override
public String toString() {
	return "Products [productCode=" + productCode + ", productName=" + productName 
			+ ", productScale=" + productScale + ", productVendor=" + productVendor + ", productDescription="
			+ productDescription + ", quantityInStock=" + quantityInStock + ", buyPrice=" + buyPrice + ", MSRP=" + MSRP
			+ "]";
}

}
