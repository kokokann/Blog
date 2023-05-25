package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import models.Account;
import services.AccountService;

@Controller
public class RegisterController {
	@Autowired
	AccountService accountService;// 实例服务器

	@GetMapping("/register")
	public String getRegister() {
		return "Register.html";
	}

	@PostMapping("/user-register")
	public ModelAndView register(@RequestParam String username, @RequestParam String password, ModelAndView mav) {
		if (accountService.createNewUser(new Account(username, password))) {
			mav.setViewName("login.html");
		} else {
			mav.addObject("isWrong", true);
			mav.setViewName("register.html");
		}

		return mav;
	}
}
