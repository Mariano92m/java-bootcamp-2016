package com.Topic3.ShoppingCart;


import java.util.ArrayList;
import java.util.List;

public class Cart implements CartI{
	
	private List<ObjInCart> objInCart;
	
	public Cart(){
		this.objInCart=new ArrayList<ObjInCart>();
	}
	
	public void add(ObjInCart o){
		if(!objInCart.contains(o))
			objInCart.add(o);
	}

	public void remove(ObjInCart o) {
		this.objInCart.remove(o);
	}

	public List<ObjInCart> objInCart() {
		return this.objInCart;
	}

}
