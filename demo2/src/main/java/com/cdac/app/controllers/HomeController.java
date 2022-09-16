package com.cdac.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public void kuchBhi() {
		System.out.println("Chal gya !!!");
	}
}
