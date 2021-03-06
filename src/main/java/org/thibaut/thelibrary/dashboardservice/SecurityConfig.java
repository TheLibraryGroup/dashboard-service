package org.thibaut.thelibrary.dashboardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//	@Override
//	public void configure( AuthenticationManagerBuilder auth) throws Exception {
//		auth
//				.inMemoryAuthentication()
//				.passwordEncoder( NoOpPasswordEncoder.getInstance())
//				.withUser("hystUser")
//				.password("hystPassword")
//				.authorities("ADMIN");
//	}

    @Override
    protected void configure( HttpSecurity http) throws Exception {
        http
		        .authorizeRequests()
		        .antMatchers(HttpMethod.GET, "/actuator/**").permitAll()

		        .antMatchers(HttpMethod.GET, "/hystrix/**").permitAll()
		        .antMatchers(HttpMethod.POST, "/hystrix/**").permitAll()
		        .antMatchers(HttpMethod.DELETE, "/hystrix/**").permitAll()
		        .antMatchers(HttpMethod.PUT, "/hystrix/**").permitAll()

		        .and().csrf().disable();
    }
}
