package com.cdac.app.bean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cdac.app.domain.UserLogin;
import com.cdac.app.repositories.IUserLoginRepository;
import com.cdac.app.service.IAuthenticationService;

@Component
@Transactional
public class AuthenticationServiceImpl implements IAuthenticationService {

	@Autowired
	private IUserLoginRepository userLoginRepository;

	private PasswordEncoder passwordEncoder;

	// Method to validate user using name and password
	@Override
	public UserLogin validateUser(String userName, String password) {
		passwordEncoder = new BCryptPasswordEncoder();

		UserLogin user = userLoginRepository.findByUPrn(Long.parseLong(userName));
		if(user!=null) {
			String userPassword = user.getuPassword();
			
			if(passwordEncoder.matches(password, userPassword)) {
				return user;
			}else {
				return null;
			}
		}
		return null;
	}
}