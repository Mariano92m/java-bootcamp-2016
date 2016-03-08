package com.Topic3.ShoppingCart;

public class ObjInCart {
	private Product product;
	private int quantity;
	
	public ObjInCart(Product product, int quantity){
		this.setProduct(product);
		this.setQuantity(quantity);
	}
	
	
	//Getters and Setters
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
