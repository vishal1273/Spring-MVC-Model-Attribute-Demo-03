package com.vishal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vishal.springmvc.model.User;

@Controller
@RequestMapping("user")
public class RegController {
	@GetMapping("showRegForm")
	public String showRegForm(Model model) {
		return "reg-form";
	}

	@GetMapping("regProcess")
	public String processRegistration(Model model, @ModelAttribute("user") User user) {
		model.addAttribute("user", user);
		return "reg-process";
	}

	@ModelAttribute
	public void addCommonMessage(Model model) {
		model.addAttribute("commonHeader", "Welcome to VBSH Pvt. Ltd.!");
	}

}
