/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083] & Joy Pahari [220340120092]
 * @Date: 21-09-2022 
 */
package com.cdac.app.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.app.domain.UserLogin;
import com.cdac.app.domain.UserToken;
import com.cdac.app.dto.Login;
import com.cdac.app.exception.CDACAppException;
import com.cdac.app.service.IAuthenticationService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Controller
public class HomeController {

	private final static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private IAuthenticationService service;

	@GetMapping("/home")
	public String homePage() {
		return "/login";
	}

	@PostMapping("/home/sign-in")
	public ResponseEntity<?> login(@RequestBody Login login) {

		String username = login.getUser();
		String password = login.getPassword();
		try {
			UserLogin user = service.validateUser(username, password);
			if (user != null) {
				String token = getJWTToken(username);
				UserToken userToken = new UserToken();
				userToken.setuPrn(Long.parseLong(username));
				userToken.setToken(token);
				userToken.setuRole(user.getuRole());
				return new ResponseEntity<UserToken>(userToken, HttpStatus.OK);
			} else {
				throw new CDACAppException("Invalid Credentials!");
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			UserToken token = null;
			return new ResponseEntity<UserToken>(token, HttpStatus.OK);
		}
	}

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ADMIN");

		String token = Jwts.builder().setId("softtekJWT").setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();

		return "Bearer " + token;
	}

}