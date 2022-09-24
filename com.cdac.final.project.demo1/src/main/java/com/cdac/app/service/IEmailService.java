package com.cdac.app.service;

import com.cdac.app.domain.EmailDetails;

public interface IEmailService {
	String sendSimpleMail(EmailDetails details);
}
