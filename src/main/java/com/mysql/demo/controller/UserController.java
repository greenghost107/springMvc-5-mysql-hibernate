package com.mysql.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.demo.entity.User;
import com.mysql.demo.repository.UserRepository;

@Controller
public class UserController {
	
//	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = { "/index" })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
	}
	
	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("userForm", new User());
		
		return "registration";
	}
}
