package com.Topic3.ShoppingCart;

import java.util.List;

public interface CartI {
	public void add(ObjInCart o);
	
	public void remove(ObjInCart o);
	
	public List<ObjInCart> objInCart();
}
