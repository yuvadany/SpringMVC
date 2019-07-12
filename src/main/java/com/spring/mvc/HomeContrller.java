package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContrller {

	@GetMapping ("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView  welcome() {
		ModelAndView  modelView = new ModelAndView ("home");
		modelView.addObject("name", "Yuvi");
		return modelView;
	}
}
