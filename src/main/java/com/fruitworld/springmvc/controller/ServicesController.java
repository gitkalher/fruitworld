package com.fruitworld.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ServicesController {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	public ServicesController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String services() {
		LOG.debug("Attempting to access services.");
	
		
		return "services";
	}

}
