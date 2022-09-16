package com.cdac.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public void kuchBhi() {
		System.out.println("Chal gya !!!");
	}
}
