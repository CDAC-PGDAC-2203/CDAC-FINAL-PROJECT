package com.cdac.app.service;

import com.cdac.app.domain.UserLogin;

public interface IAuthenticationService {
	UserLogin validateUser(String user,String password);
}
