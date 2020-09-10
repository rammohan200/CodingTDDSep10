package com.whyinnovation.product.psatdd;

import java.util.ArrayList;
import java.util.List;

public class ValueMart {

	private List<Product> productList;
	
	private Cart cart;

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<Product> getProductList() {
		return this.productList;
	}

	public Cart getCart() {
		return cart;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
}
