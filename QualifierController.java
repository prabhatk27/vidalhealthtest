package com.cdac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdac.model.QualifierModel;

import studentMvc.Student;

@Controller
public class QualifierController {

	@GetMapping("/register")
	public String registerpage() {
		return "registration";
	}

	
	@PostMapping("/registerEmp")
	public String employee(@ModelAttribute QualifierModel qm,Model m) {
		m.addAttribute("quali", qm);
		return "view";
	}
	

	
}
