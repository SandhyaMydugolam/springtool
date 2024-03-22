package com.example.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebConfig {
	
	//two beans
		// authentication using inmemory authencation
	@Bean
	public UserDetailsManager userDetailsManager () {
		UserDetails user1=
				User.withUsername("sri")
				.password(encoder().encode("sri123"))
				.roles("user")
				.build();
		
		UserDetails user2=
				User.withUsername("siri")
				.password(encoder().encode("siri123"))
				.roles("user")
				.build();
		
		return new InMemoryUserDetailsManager(user1,user2);
	}
	@Bean
	public PasswordEncoder encoder () {
		return new BCryptPasswordEncoder();
		}
	//authorization bean
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		//authorize http requests based on roles
		//implements customizer functional interface
		return http
				.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests((auth)-> auth
						.requestMatchers("/api/user/**").hasAnyRole("user","ADMIN")
						.anyRequest().authenticated()
	)
	.sessionManagement(sess -> sess.sessionCreationPolicy(
			SessionCreationPolicy.STATELESS))
	.httpBasic(Customizer.withDefaults())
	.build();
	
	}
}
