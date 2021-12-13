package com.BankingApplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		    .antMatchers("/balance").authenticated()
		    .antMatchers("/home").permitAll()
		    .antMatchers("/contact").permitAll()
		    .antMatchers("/about").permitAll()
		    .and().formLogin()
            .and().httpBasic();	  
	
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		    .withUser("Sharvani").password("sh@ru123").authorities("admin").and()
		    .withUser("Sruthi").password("Sru456").authorities("user").and()
		    .withUser("Supriya").password("Suppi21").authorities("user").and()
		    .withUser("Meena").password("meena12").authorities("user").and()
		    .withUser("Kat").password("kathy123").authorities("user").and().passwordEncoder(NoOpPasswordEncoder.getInstance());		    
	}
	
	

}
