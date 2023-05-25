package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import services.AccountService;

public class LoginController {
	@Autowired
	AccountService accountService;//实例服务器

	@PostMapping("/login")
	public ModelAndView login(@RequestParam String username, @RequestParam String password, ModelAndView mav) {
		if (accountService.validateAccount(username, password)) {
			mav.addObject("name", username);
			mav.setViewName("Login.html");
		} else {
			mav.setViewName("Register.html");
		}

		return mav;
	}
}
