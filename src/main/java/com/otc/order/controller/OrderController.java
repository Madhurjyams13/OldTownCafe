package com.otc.order.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	private static Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@RequestMapping(value="/test" , method = RequestMethod.GET)
	public String Test()
	{
		
		logger.info("==> Success on Docker");
		
		return "Success on Docker";
	}
	
	
}
