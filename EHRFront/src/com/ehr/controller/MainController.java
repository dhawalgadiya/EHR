package com.ehr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController
{
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	  public String welcome(Model model) {
	    model.addAttribute("hello","Hello World");
	    return "index";
	  }
}
