package com.cdac.app.bean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdac.app.domain.UserLogin;
import com.cdac.app.repositories.IUserLoginRepository;
import com.cdac.app.service.IAuthenticationService;

@Component
@Transactional
public class AuthenticationServiceImpl implements IAuthenticationService {

	@Autowired
	private IUserLoginRepository userLoginRepository;
	
	@Override
	public UserLogin validateUser(String userName, String password) {
		return userLoginRepository.findByUserPassword(Long.parseLong(userName),password);
	}
}