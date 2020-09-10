
package com.whyinnovation.product.psatdd;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ShoppingCartTest {
  	ValueMart valueMart = new ValueMart();
    @Test
    public void testFeaturedListOfItems() {
    	
    	List<Product> productList = new ArrayList<Product>();
		Product product1 = new Product();
		Product product2 = new Product();
		productList.add(product1);
		productList.add(product2);
		valueMart.setProductList(productList);
		
		assertEquals(valueMart.getProductList().size(),2);
    
     }
    
    
    @Test
    public void testAddToCart() {
    	
    	Cart cart = new Cart();
    	valueMart.setCart(cart);
    	
    	
    	Product product = new Product();
    	product.setProductId(001);
    	product.setProductName("Colgate");
    	
		cart.addToCart(product);
		
		Product product_two = new Product();
		product_two.setProductId(002);
		product_two.setProductName("Closeup");
    	
    	cart.addToCart(product_two);
		
    	assertEquals(2, cart.getTotalNoofItems().size());
    }

    

}
