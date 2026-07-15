package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/info")
	public String mapping(ModelMap map) {
		map.put("name", "Madiha");
		map.put("salary", "75000");
		return "info.jsp";
		
	}
	
	@RequestMapping("/details")
	public ModelAndView mv() {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.addObject("name","Subiya");
		modelAndView.addObject("msg","getting placed soon");
		modelAndView.setViewName("details.jsp");
		return modelAndView;
		
	}

}
