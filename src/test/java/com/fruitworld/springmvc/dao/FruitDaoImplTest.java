package com.fruitworld.springmvc.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FruitDaoImplTest {

	
	private FruitDao fruitDao = new FruitDaoIml();

	@Test
	public void testGoodForNothing() {
		assertNotNull(fruitDao);
	}

}
