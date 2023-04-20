package com.toyproject.bookmanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedMethods("*")
			.allowedOrigins("*"); // 3000번 포트에서 들어오는 모든 요청 열어줌.
			//.allowedOrigins("http://localhost:3000"); // 3000번 포트에서 들어오는 모든 요청 열어줌.
	}
}
