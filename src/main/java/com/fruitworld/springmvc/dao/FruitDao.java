package com.fruitworld.springmvc.dao;

import com.fruitworld.springmvc.entity.Fruit;

public interface FruitDao {

	public Fruit findFruitByName(String name);
	
	public Fruit findFruitById(Long id);
	
	public void saveFruit(Fruit fruit);
	
	public void editFruit(Fruit fruit);
	
}
