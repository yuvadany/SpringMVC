package com.spring.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContrller {

	private final Logger logger = LoggerFactory.getLogger(HomeContrller.class);

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("login");
		logger.info(" home() function");
		return mv;
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView modelView = new ModelAndView("home");
		modelView.addObject("name", "Yuvi");
		logger.info(" welcome() function");
		return modelView;
	}
}
