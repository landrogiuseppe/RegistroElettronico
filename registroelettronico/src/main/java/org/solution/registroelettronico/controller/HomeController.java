package org.solution.registroelettronico.controller;

import org.solution.registroelettronico.entity.User;
import org.solution.registroelettronico.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
    UserRepository userRepository;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
	
	
	@RequestMapping(value = "/admin/users/addP", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user") User userEntity) {
        userRepository.save(userEntity);
        return "redirect:/admin/users";
    }
	
	


}
