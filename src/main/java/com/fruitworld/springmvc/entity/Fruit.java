package com.fruitworld.springmvc.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fruit {

	private static final Logger logger = LoggerFactory.getLogger(Fruit.class);
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	private Long id;
	private String name;
	private String color;
	private String test;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
