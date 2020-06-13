package com.example.demo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome home!";
	}

	@PreAuthorize("hasAuthority('admin')")
	@RequestMapping("/restricted")
	@ResponseBody
	public String restricted() {
		return "You found the secret lair!";
	}
}
