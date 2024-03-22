package com.insuranceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AppUsermapper {
	
// convert userDetails to AppUser
	public AppUser convertToAppUser(UserDetails userDetails) {
		String username = userDetails.getUsername();
		String password = userDetails.getPassword();
	// List<GrantedAuthority> authorities=
		userDetails.getAuthorities();
		AppUser appUser = new AppUser();
		appUser.setUserName(username);
		appUser.setPassword(password);
		return appUser;
	}
	
	//from db to frontend
	// convert userDetails to AppUser
	public UserDetails convertToUserDetails(AppUser appuser) {
		String username = appuser.getUserName();
		String password = appuser.getPassword();
	 List<GrantedAuthority> authorities= new ArrayList<>();
		
	 //create roles for user
	 
	 List<String> roles = Arrays.asList("user","admin");
	 for(String role:roles) {
		 
		// create a simplegranted authority
	SimpleGrantedAuthority simpleAuthority = new SimpleGrantedAuthority(role);
		 //add to the List of granted authority
	authorities.add(simpleAuthority);
		 
	 }
	 //create a userDetails object
	 UserDetails details = new User(username,password,authorities);
	 return details;
	}

}
