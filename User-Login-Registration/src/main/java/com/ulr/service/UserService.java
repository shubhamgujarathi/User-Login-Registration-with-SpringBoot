package com.ulr.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ulr.model.User;
import com.ulr.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
