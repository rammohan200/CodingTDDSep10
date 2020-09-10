package com.whyinnovation.product.psatdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
	
	private Map<Integer,Integer> cartValue = new HashMap<Integer,Integer>();

	public Map<Integer,Integer> getTotalNoofItems() {
		
		return cartValue;
	}


	public void addToCart(Product product) {
		
		if(cartValue != null && cartValue.containsKey(product.getProductId())) {
			
			int quantity = cartValue.get(product.getProductId());
			cartValue.put(product.getProductId(), quantity++);
						
		} else {
			
			cartValue.put(product.getProductId(), 1);
		}
	}
	

}
