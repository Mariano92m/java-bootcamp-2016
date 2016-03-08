package com.Topic3.ShoppingCart;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CartTest {
	private Cart cart;
	private ObjInCart oicA;
	private ObjInCart oicB;
	private Product pA;
	private Product pB;
	
	
	@Before
	public void setUp(){
		cart= new Cart();
		
		pA= new Product("Chease", 3.5);
		pB= new Product("Bread", 2.5);
		
		oicA= new ObjInCart(pA,10);
		oicB= new ObjInCart(pB,10);
		
		Assert.assertEquals(oicA.getProduct(), pA);
		Assert.assertEquals(oicB.getProduct(), pB);
	}
	
	@Test
    public void testAddObjInCart() {
        cart.add(oicA);

        List<ObjInCart> oics = cart.objInCart();
        for (ObjInCart oic : oics)
            if (oic.getProduct().getName().equals(oicA.getProduct().getName()))
                Assert.assertEquals(oicA, oic);

        cart.add(oicA);
        cart.remove(oicA);
        for (ObjInCart oic : oics)
            Assert.assertNotEquals(oicA, oic);
    }
	
	@Test
	public void testRemoveObjInCart(){
		cart.add(oicA);
		cart.remove(oicA);
		List<ObjInCart> oics = cart.objInCart();
		for(ObjInCart oic: oics){
			Assert.assertNotEquals(oicA,oic);
		}
	}
	
}
