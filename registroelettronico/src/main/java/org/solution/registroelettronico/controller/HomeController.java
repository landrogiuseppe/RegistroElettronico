package org.solution.registroelettronico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	  private LocalContainerEntityManagerFactoryBean entityManagerFactoryBean;
	
	@RequestMapping(value ="/greeting")
	public String sayHello (Model model) {
		
		model.addAttribute("greeting", "Hello tutut");
		
		return "hello";
}

}
