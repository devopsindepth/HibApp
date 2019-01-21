package com.mtc.app.vo;

import java.sql.Blob;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="productlines")
public class productLines {
	
@Id
private String productLine;
private String textDescription;
private String htmlDescription;
private Blob image;
@OneToMany(mappedBy="productLine")
private Set<Products> products;
public String getProductLine() {
	return productLine;
}
public void setProductLine(String productLine) {
	this.productLine = productLine;
}
public String getTextDescription() {
	return textDescription;
}
public void setTextDescription(String textDescription) {
	this.textDescription = textDescription;
}
public String getHtmlDescription() {
	return htmlDescription;
}
public void setHtmlDescription(String htmlDescription) {
	this.htmlDescription = htmlDescription;
}
public Blob getImage() {
	return image;
}
public void setImage(Blob image) {
	this.image = image;
}
public Set<Products> getProducts() {
	return products;
}
public void setProducts(Set<Products> products) {
	this.products = products;
}
@Override
public String toString() {
	return "productLines [productLine=" + productLine + ", textDescription=" + textDescription + ", htmlDescription="
			+ htmlDescription + ", image=" + image;
}

}
