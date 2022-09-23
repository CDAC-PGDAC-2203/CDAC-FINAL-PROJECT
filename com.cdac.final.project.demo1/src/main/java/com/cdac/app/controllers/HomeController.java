package com.cdac.app.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.app.domain.UserLogin;
import com.cdac.app.domain.UserToken;
import com.cdac.app.service.IAuthenticationService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Controller
public class HomeController {

	@Autowired
	private IAuthenticationService service;

	@GetMapping("/home")
	public String homePage(){
		return "/login";
	}

	@PostMapping("/home/login")
	public UserToken login(@RequestParam("user") String username, @RequestParam("password") String password) {
		
		UserLogin user = service.validateUser(username, password);
		if(user!=null) {
			String token = getJWTToken(username);
			UserToken userToken = new UserToken();
			userToken.setuPrn(Long.parseLong(username));
			userToken.setToken(token);		
			return userToken;
		}
		return null;
	}

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ADMIN");
		
		String token = Jwts.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
	
}
