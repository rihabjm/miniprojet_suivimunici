package com.miniprojet.suivi.config;
/*
import java.beans.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.authentication.configurers.userdetails.UserDetailsServiceConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;

//import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.NoOp;



@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
@EnableWebSecurity*/
public class appSecurityConfig {
/*extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService UserDetailsService ; 
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider() ; 
		provider.setUserDetailsService(UserDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider ;  
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
		//UserDetailsService.
	}
	
	
	
	
	/*
	@Bean
	@SuppressWarnings("deprecation")
	 public static NoOpPasswordEncoder passwordEncoder() {
	     return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	 }*/
	
/*
@Override
protected UserDetailsService userDetailsService() {
	// TODO Auto-generated method stub
	
	return super.userDetailsService();
}*/	
	
	//config
	
	/*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/login").permitAll();
		//http.authorizeRequests().antMatchers(HttpMethod.POST,"/membre").permitAll();
		http.authorizeRequests().anyRequest().authenticated() ;
		http.cors() ; 
	
	
                
	}*/
}
