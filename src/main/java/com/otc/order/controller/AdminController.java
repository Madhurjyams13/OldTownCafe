package com.otc.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private static Logger logger = LoggerFactory.getLogger(AdminController.class);

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String Test()
	{
		logger.info("====> Success on Admin Controller");
		
		return "/admin/login";
	}
	
	
}
