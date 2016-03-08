package com.Topic3.User;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;



public class UserRepositoryTest {
	
	private UserRepositoryI userRepo;
	
	@Before
	public void setUp(){
		this.userRepo = UserRepositoryFactory.getLocalUserRepository();
	}
	
	@Test
	public void testCreate(){
		User user1 = new User("Tuni", "pass");
		userRepo.create(user1);
		List<User> users= userRepo.update();
		Assert.assertEquals(1, users.size());
		Assert.assertEquals("Tuni", users.get(0).getName());
		
		user1.setPass("1234");
		userRepo.create(user1);
		Assert.assertEquals(1, users.size());
		Assert.assertEquals("Tuni", users.get(0).getName());
	}	
	
	@Test
    public void testUpdate() {
        User userX;
        List<User> test_list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            userX = new User("User " + i, "User pass" + i);
            userRepo.create(userX);
            test_list.add(userX);
        }

        Assert.assertEquals(10, userRepo.update().size());
        Assert.assertTrue(userRepo.update().containsAll(test_list));
    }
	
	@Test
    public void testDelete() {
        User user1 = new User("Tuni", "pass");
        userRepo.create(user1);
        boolean result = userRepo.delete(user1.getId());
        Assert.assertFalse(userRepo.update().contains(user1));
        Assert.assertTrue(result);

        User user2 = new User("Manito", "pass");
        result = userRepo.delete(user2.getId());
        Assert.assertFalse(result);
    }
}
