package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
	@PostMapping("/index")
	public String index() {
		return "index.html";
	}
	
	@PostMapping("/Register")
	public String Register() {
		return "Register.html";
	}
	
	@PostMapping("/Login")
	public String Login() {
		return "Login.html";
	}
	
	
}

