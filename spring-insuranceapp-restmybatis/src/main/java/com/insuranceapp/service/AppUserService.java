package com.insuranceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insuranceapp.model.AppUser;
import com.insuranceapp.model.AppUsermapper;
import com.insuranceapp.repository.IAppUserRepository;
@Service
@Transactional
public class AppUserService implements UserDetailsManager {
	
	@Autowired
	private IAppUserRepository appUserRepository;
	
	@Autowired
	private AppUsermapper appUsermapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser appUser = appUserRepository.findByusername(username);
		if(appUser==null) {
		throw new UsernameNotFoundException(username);	
		}
		return null;
	}

	@Override
	public void createUser(UserDetails user) {
		
		appUserRepository.addUser(null);
		
	}

	@Override
	public void updateUser(UserDetails user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
