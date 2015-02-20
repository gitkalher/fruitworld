package com.fruitworld.springmvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public String contacts() {
		//TODO Still need to implement services.
		return "contacts";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String products() {
		//TODO Still need to implement products.
		return "products";
	}
	
	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String abountUs() {
		//TODO Still need to implement aboutUs. Waiting on BA.
		return "aboutus";
	}

	
}
